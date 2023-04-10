package dataAccess.abstracts;

import entities.Branches;
import entities.Car;

import java.util.List;

public interface BranchesDao {

    void add(Branches branches);

    List<Branches> getAll();

    void delete(Branches branches);

    Branches getById(int id);

}
