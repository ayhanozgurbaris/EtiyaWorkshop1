package services.concretes;

import dataAccess.abstracts.CarDao;
import entities.Branches;
import entities.Car;
import services.abstracts.CarService;

import java.util.List;

public class CarManager implements CarService {

    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public void add(Car car) {

        if (car.getPrice()<0){
            System.out.println("0 veya küçük olamaz");
            return;
        }
        for (Car cars : carDao.getAll()) {
            if (cars.getCarId() == car.getCarId()) {
                System.out.println(car.getCarId() + " ID numaralı araç zaten mevcut. " + car.getCarModel() + " adlı araç eklenemedi.");
                return;
            }
        }
        carDao.add(car);

    }

    @Override
    public void delete(Car car){
        carDao.delete(car);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }

}
