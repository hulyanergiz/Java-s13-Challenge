package com.workintech.models;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if(index<0){
            System.out.println("Index cannot be negative.Typed index:"+index);
        }
        else if (index> healthPlans.length-1){
            System.out.println("addHealthPlan: "+index+". index is not exist in health plans array");
        }else {
            try {
                boolean isExist=false;
                if (Arrays.asList(healthPlans).contains(name)) {
                    isExist = true;
                    System.out.println(name + " is exist in healthPlans");
                }
                if (!isExist) {
                    if (healthPlans[index] != null) {
                        System.out.println("addHealthPlan: " + index + ". index is not empty in health plans array");
                    } else {
                        healthPlans[index] = name;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(index + "is an invalid index");
            } catch (Exception exception) {
                System.out.println("error: " + exception.getMessage());
            }
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
