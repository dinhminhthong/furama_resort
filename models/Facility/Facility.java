package models.Facility;

public abstract class Facility {
    private String id;
    private String nameService;
    private int age;
    private int costs;
    private int people;
    private String rental;

    protected Facility(String idFacility, String nameService, int age, int costs, int people, String rental) {
        this.id = id;
        this.nameService = nameService;
        this.age = age;
        this.costs = costs;
        this.people = people;
        this.rental = rental;
    }
    protected Facility(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", age=" + age +
                ", costs=" + costs +
                ", people=" + people +
                ", rental='" + rental + '\'' +
                '}';
    }
}
