package com.qiong.pojo;

public class Student {

    int sno;
    private String name;
    private String sex;
    private String enterdate;
    private String classname;
    private String email;

    public Student(int sno, String name, String sex, String enterdate, String classname, String email) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
        this.enterdate = enterdate;
        this.classname = classname;
        this.email = email;
    }

    public Student() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(String enterdate) {
        this.enterdate = enterdate;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", enterdate='" + enterdate + '\'' +
                ", classname='" + classname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
