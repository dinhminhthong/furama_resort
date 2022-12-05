package models;

public class Booking {
    private int idBooking;
    private String dayBook;
    private String endBook;

    private String idFacility;
    private String nameService;


    public Booking(int idBooking, String dayBook, String endBook, String idFacility, String nameService) {
        this.idBooking = idBooking;
        this.dayBook = dayBook;
        this.endBook = endBook;
        this.idFacility = idFacility;
        this.nameService = nameService;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBook() {
        return dayBook;
    }

    public void setDayBook(String dayBook) {
        this.dayBook = dayBook;
    }

    public String getEndBook() {
        return endBook;
    }

    public void setEndBook(String endBook) {
        this.endBook = endBook;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayBook='" + dayBook + '\'' +
                ", endBook='" + endBook + '\'' +
                ", idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                '}';
    }
}
