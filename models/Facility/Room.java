package models.Facility;

public class Room extends Facility{
    private String freeService;

    public Room(String idFacility, String nameService, int age,
                int costs, int people, String rental, String freeService) {
        super(idFacility, nameService, age, costs, people, rental);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
