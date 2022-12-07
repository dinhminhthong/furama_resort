package controller;

import models.Facility.Facility;
import models.Facility.Room;
import models.Facility.Villa;
import service.extend.IFacilityService;
import service.extend.impl.FacilityServiceImpl;

import java.util.Map;

public class FacilityController {
    IFacilityService facilityService = new FacilityServiceImpl();
    public Map<Facility, Integer> getFacilityList() {
        return facilityService.getFacilityList();
    }
    public void addVilla(Villa villa) {
        facilityService.add(villa);
    }
    public void addRoom(Room room) {
        facilityService.add(room);
    }
    public void displayMaintance() {
       facilityService.displayMaintance();

        }
    }