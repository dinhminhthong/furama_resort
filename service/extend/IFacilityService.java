package service.extend;

import models.Facility.Facility;
import models.Facility.Room;
import models.Facility.Villa;
import service.IService;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityService extends IService<Facility> {

    Map<Facility, Integer> getFacilityList();
    void addVilla(Villa villa);

    void addRoom(Room room);

    //hien thi danh sach bao tri
    void displayMaintance();
}
