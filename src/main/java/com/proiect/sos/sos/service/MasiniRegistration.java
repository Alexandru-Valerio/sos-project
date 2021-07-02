package com.proiect.sos.sos.service;

import com.proiect.sos.sos.model.Masini;

import java.util.ArrayList;
import java.util.List;

public class MasiniRegistration {
    private List<Masini> masiniRecords;

    private static MasiniRegistration stdregd = null;

    private MasiniRegistration(){
        masiniRecords = new ArrayList<Masini>();
    }

    public static MasiniRegistration getInstance() {

        if(stdregd == null) {
            stdregd = new MasiniRegistration();
            return stdregd;
        }
        else {
            return stdregd;
        }
    }

    public void add(Masini masina) {
        masiniRecords.add(masina);
    }

    public String updateMasini(Masini masina) {

        for(int i=0; i<masiniRecords.size(); i++)
        {
            Masini masinan = masiniRecords.get(i);
            System.out.println(masinan.getRegNum());
            System.out.println(masina.getRegNum());
            if(masinan.getRegNum().equals(masina.getRegNum())) {
                masiniRecords.set(i, masina);//update the new record
                return "Update successful";
            }
        }

        return "Update un-successful";

    }

    public String deleteMasini(String regNum) {

        for(int i=0; i<masiniRecords.size(); i++)
        {
            Masini masinan = masiniRecords.get(i);
            if(masinan.getRegNum().equals(regNum)) {
                masiniRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }

        return "Delete un-successful";

    }

    public List<Masini> getMasiniRecords() {
        return masiniRecords;
    }
}
