package production_manage;

public class Engineer extends Employee {
    private String technique;

    public Engineer(String name, int age, boolean gender, String address, String technique) {
        super(name, age, gender, address);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public void display() {
        System.out.printf("|%-10s |%-30s |%-3d |%-10s |%-20s |%-20s|%n", "Engineer",
                super.getName(), super.getAge(), super.isGender(), super.getAddress(), this.getTechnique());
    }
}
