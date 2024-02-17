package com.techthink.employee.models;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private String panNo;
    private Long aadharNo;
    private String uanNo;
    private Long mobileNo;
    private String personalEmailAddress;

    public Employee() {
    }

    public Employee(String firstName, String middleName, String lastName, String panNo, Long aadharNo, String uanNo, Long mobileNo, String personalEmailAddress) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.panNo = panNo;
        this.aadharNo = aadharNo;
        this.uanNo = uanNo;
        this.mobileNo = mobileNo;
        this.personalEmailAddress = personalEmailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public Long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(Long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getUanNo() {
        return uanNo;
    }

    public void setUanNo(String uanNo) {
        this.uanNo = uanNo;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPersonalEmailAddress() {
        return personalEmailAddress;
    }

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", panNo='" + panNo + '\'' +
                ", aadharNo=" + aadharNo +
                ", uanNo='" + uanNo + '\'' +
                ", mobileNo=" + mobileNo +
                ", personalEmailAddress='" + personalEmailAddress + '\'' +
                '}';
    }
}
