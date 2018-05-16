package org.brohede.marcus.fragmentsapp;

public class Mountain {
    //private int id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    //private String auxData;

    public Mountain(String inName, String inLocation, int inSize){
        //id=inId;
        name=inName;
        //type=inType;
        //company=inCompany;
        location=inLocation;
        //category=inCategory;
        size=inSize;
        //cost=inCost;
        //auxData=inAuxdata;
    }

    @Override
    public String toString() {
        return name;
    }

    public String info(){
        String str= "Name: " + name;
        str += "\n" + "Plats: " + location;
        str += "\n" + "Höjd: " + size;
        return str;
    }
}