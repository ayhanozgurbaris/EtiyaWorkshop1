package services.abstracts;

import entities.Branches;

import java.util.List;

public interface BranchesService {

    void add(Branches branches);

    List<Branches> getAll();

    void delete(Branches branches);

    Branches getById(int id);

}
