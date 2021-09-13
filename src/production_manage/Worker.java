package production_manage;

public class Worker extends Employee {
    private int rank;

    public Worker(String name, int age, boolean gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void display() {
        System.out.printf("|%-10s |%-30s |%-3d |%-10s |%-20s |%-20d|%n", "Worker",
                super.getName(), super.getAge(), super.isGender(), super.getAddress(), this.getRank());
    }
}
