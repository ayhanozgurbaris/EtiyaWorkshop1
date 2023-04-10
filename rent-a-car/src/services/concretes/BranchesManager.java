package services.concretes;

import dataAccess.abstracts.BranchesDao;
import entities.Branches;
import services.abstracts.BranchesService;
import java.util.List;

public class BranchesManager implements BranchesService {


    private final BranchesDao branchesDao;

    public BranchesManager(BranchesDao branchesDao) {
        this.branchesDao = branchesDao;
    }

    @Override
    public void add(Branches branches) {
        for (Branches branchesx : branchesDao.getAll()) {
            if (branchesx.getBranchId() == branches.getBranchId()) {
                System.out.println(branches.getBranchId() + " ID numaralı şube zaten mevcut. " + branches.getBranchCity() + " adlı şube eklenemedi.");
                return;
            }
        }
        branchesDao.add(branches);
    }

    @Override
    public List<Branches> getAll() {
        return branchesDao.getAll();
    }

    @Override
    public void delete(Branches branches) {
        branchesDao.delete(branches);
    }

    @Override
    public Branches getById(int id) {
        return branchesDao.getById(id);
    }
}
