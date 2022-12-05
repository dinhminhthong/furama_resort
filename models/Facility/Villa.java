package models.Facility;

public class Villa extends Facility{
    private String standard;
    private int agePool;

    public Villa(String idFacility, String nameService, int age, int costs,
                 int people, String rental, String standard, int agePool) {
        super(idFacility, nameService, age, costs, people, rental);
        this.standard = standard;
        this.agePool = agePool;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getAgePool() {
        return agePool;
    }

    public void setAgePool(int agePool) {
        this.agePool = agePool;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", agePool=" + agePool +
                '}';
    }
}
