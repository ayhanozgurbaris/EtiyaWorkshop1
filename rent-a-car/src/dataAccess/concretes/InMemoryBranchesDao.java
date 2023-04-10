package dataAccess.concretes;

import dataAccess.abstracts.BranchesDao;
import entities.Branches;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBranchesDao implements BranchesDao {


    List<Branches> branchess = new ArrayList<>();

    @Override
    public void add(Branches branches) {
        branchess.add(branches);
    }

    @Override
    public List<Branches> getAll() {
        return branchess;
    }

    @Override
    public void delete(Branches branches) {
        branchess.remove(branches);
        System.out.println(branches.getBranchCity() + " adlı şehir silindi.");

    }

    @Override
    public Branches getById(int id) {
        return branchess.stream()
                .filter(branches -> branches.getBranchId() == id)
                .findFirst()
                .orElseThrow();
    }
}
