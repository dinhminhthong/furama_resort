package models.person;

public class Employee extends Person{
    private int idStaff;
    private String level;
    private String position;
    private int wage;

    public Employee(){
    }

    public Employee(String name, String gender, int CMND, String age, String telephonenumber,
                    String email, String address, int idStaff, String level, String position, int wage) {
        super(name, gender, CMND, age, telephonenumber, email, address);
        this.idStaff = idStaff;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }



    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idStaff=" + idStaff +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
