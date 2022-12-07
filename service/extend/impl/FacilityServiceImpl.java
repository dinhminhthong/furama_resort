package service.extend.impl;

import models.Facility.Facility;
import models.Facility.Room;
import models.Facility.Villa;
import service.extend.IFacilityService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {



    private static  final Map<Facility,Integer> facilityList = new LinkedHashMap<>();


    @Override
    public Map<Facility, Integer> getFacilityList() {
        return facilityList;
    }

    @Override
    public void addVilla(Villa villa) {
        facilityList.put(villa,0);
    }

    @Override
    public void addRoom(Room room) {
        facilityList.put(room,0);
    }

    @Override
    public void displayMaintance() {
        for (Map.Entry<Facility,Integer>fac: facilityList.entrySet()) {
            if (fac.getValue()>=5){
                System.out.println(fac);
            }

        }
    }


    @Override
    public List<Facility> getList() {
        return null;
    }

    @Override
    public void add(Facility object) {

    }

    @Override
    public void edit(Facility object) {

    }

    @Override
    public void delete(Facility object) {

    }
}
