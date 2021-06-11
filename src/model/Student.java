package model;

import java.time.LocalDate;

public class Student {
    private LocalDate dateOfBirth;
    private String contact;
    private String email;
    private String nic;
    private String fullName;
    private String address;

    public Student() {
    }

    public Student(String nic, String fullName, String address, String contact, String email, LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.email = email;
        this.nic = nic;
        this.fullName = fullName;
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateOfBirth=" + dateOfBirth +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", nic='" + nic + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
