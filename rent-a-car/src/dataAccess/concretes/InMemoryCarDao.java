package dataAccess.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarDao implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }


    public void delete(Car car){
        cars.remove(car);
        System.out.println(car.getCarModel() + " adlı araç silindi.");
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public Car getById(int carId) {
        return cars.stream()
                .filter(car -> car.getCarId() == carId)
                .findFirst()
                .orElseThrow();
    }
}
