package com.workintech.models;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private double editGiroValue(double giro){
        return giro<0?0:giro;
    }
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = editGiroValue(giro);
        this.developerNames = developerNames;
    }


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

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = editGiroValue(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index<0){
            System.out.println("Index cannot be negative.Typed index:"+index);
        }
        else if(index> developerNames.length-1){
            System.out.println("addEmployee: "+index+". index is not exist in health plans array");
        }else {
            try {boolean isExist=false;
                if(Arrays.asList(developerNames).contains(name)){
                    isExist=true;
                    System.out.println(name+" is exist in developerNames");
                }
                if(!isExist){
                    if(developerNames[index]!=null){
                        System.out.println("addEmployee: "+index+". index is not empty in developer names array");
                    }else{
                        developerNames[index] = name;
                    }

                }

        }catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println(index + "is an invalid index");
            } catch (Exception exception) {
                System.out.println("error: " + exception.getMessage());
            }

            }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
