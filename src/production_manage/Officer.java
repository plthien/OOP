package production_manage;

public class Officer extends Employee{
    private String task;

    public Officer(String name, int age, boolean gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void display() {
        System.out.printf("|%-10s |%-30s |%-3d |%-10s |%-20s |%-20s|%n", "Officer",
                super.getName(), super.getAge(), super.isGender(), super.getAddress(), this.getTask());
    }
}
