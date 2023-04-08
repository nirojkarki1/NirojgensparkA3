package org.example;

import java.util.List;

public class student {
    private int id;
    private String name;
    private List<phone> ph;
    private Address add;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<phone> getPh() {
        return ph;
    }

    public void setPh(List<phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public void Phones(){
        for( phone phn:ph){
            System.out.println(phn);
        }
    }

    public  void String1(){

        System.out.println( "StudentId:" + getId() +"StudentName:" + getName()  +" Address " + getAdd());
    }
}
