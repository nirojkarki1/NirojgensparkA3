package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class student {
    @Value("123")
    private int id;
    @Value("Niroj")
    private String name;
    @Autowired
    private List<phone> ph;
    @Autowired
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
