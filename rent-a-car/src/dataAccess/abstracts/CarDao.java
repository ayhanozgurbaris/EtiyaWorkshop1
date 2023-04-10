package dataAccess.abstracts;

import entities.Car;
import java.util.List;

public interface CarDao {
    void add(Car car);

    List<Car> getAll();

    void delete(Car car);

    Car getById(int id);

}
