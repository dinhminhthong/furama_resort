package service.extend;

import models.Facility.Facility;
import models.Facility.Room;
import models.Facility.Villa;
import service.IService;

public interface IFacilityService extends IService<Villa> {
    void addVilla(Villa villa);

    void addRoom(Room room);

    //hien thi danh sach bao tri
    void displayMaintance();
}
