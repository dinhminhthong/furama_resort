package models.Facility;

abstract class Facility {
    private String idFacility;
    private String nameService;
    private int age;
    private int costs;
    private int people;
    private String rental;

    public Facility(String idFacility, String nameService, int age, int costs, int people, String rental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.age = age;
        this.costs = costs;
        this.people = people;
        this.rental = rental;
    }
    private Facility(){

    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
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
                "idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                ", age=" + age +
                ", costs=" + costs +
                ", people=" + people +
                ", rental='" + rental + '\'' +
                '}';
    }
}
