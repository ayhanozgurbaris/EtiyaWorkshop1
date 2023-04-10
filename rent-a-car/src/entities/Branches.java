package entities;

public class Branches {
    private int BranchId;
    private String BranchCity;

    public int getBranchId() {
        return BranchId;
    }

    public void setBranchId(int branchId) {
        BranchId = branchId;
    }

    public String getBranchCity() {
        return BranchCity;
    }

    public void setBranchCity(String branchCity) {
        BranchCity = branchCity;
    }

    public Branches(int branchId, String branchCity) {
        BranchId = branchId;
        BranchCity = branchCity;
    }
}
