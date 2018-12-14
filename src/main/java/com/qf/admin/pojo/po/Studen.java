package com.qf.admin.pojo.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Studen {
    private int studentID;
    private String studenName;
    private String stuTel;
    private String sex;
    private String nativePlace;
    private String address;
    private String guardian;
    private String guardianTel;
    @DateTimeFormat(style = "yyyy-MM-dd")
    private String admissionTime;
    private String state;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getGuardianTel() {
        return guardianTel;
    }

    public void setGuardianTel(String guardianTel) {
        this.guardianTel = guardianTel;
    }

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "studentID=" + studentID +
                ", studenName='" + studenName + '\'' +
                ", stuTel='" + stuTel + '\'' +
                ", sex='" + sex + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", address='" + address + '\'' +
                ", guardian='" + guardian + '\'' +
                ", guardianTel='" + guardianTel + '\'' +
                ", admissionTime=" + admissionTime +
                ", state='" + state + '\'' +
                '}';
    }
}
