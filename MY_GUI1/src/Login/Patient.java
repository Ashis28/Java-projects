/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author ashis
 */
public class Patient {
    private int id;
    private String name,gender,contact;
    private int age;

    public Patient() {
        this.id = 0;
        this.name = "";
        this.age =0;
        this.gender="";
        this.contact="";
    }

    
    public Patient(int id, String name, String gender, String contact, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", contact=" + contact + ", age=" + age + '}';
    }
    
    
}
