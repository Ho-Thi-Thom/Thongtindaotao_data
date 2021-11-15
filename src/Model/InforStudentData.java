package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ngoct
 */
public class InforStudentData {

    private String studenID;
    private String nameStudent;
    private String key;
    private String sex;
    private String birthplace;
    private String classs;
    private String branch;
    private String specialized;
    private String faculty;
    private String educate;
    private String course;
    private String consultant;
    private String birthday;
    private String credit;
    private String mark10;
    private String mark4;

    public InforStudentData(String studenID, String nameStudent, String key, String sex, String birthplace, String classs, String branch, String specialized, String faculty, String educate, String course, String consultant, String birthday, String credit, String mark10, String mark4) {
        this.studenID = studenID;
        this.nameStudent = nameStudent;
        this.key = key;
        this.sex = sex;
        this.birthplace = birthplace;
        this.classs = classs;
        this.branch = branch;
        this.specialized = specialized;
        this.faculty = faculty;
        this.educate = educate;
        this.course = course;
        this.consultant = consultant;
        this.birthday = birthday;
        this.credit = credit;
        this.mark10 = mark10;
        this.mark4 = mark4;
    }

    public InforStudentData() {
        this.studenID = null;
        this.nameStudent = null;
        this.key = null;
        this.sex = null;
        this.birthplace = null;
        this.classs = null;
        this.branch = null;
        this.specialized = null;
        this.faculty = null;
        this.educate = null;
        this.course = null;
        this.consultant = null;
        this.birthday = null;
        this.credit = null;
        this.mark10 = null;
        this.mark4 = null;
    }
    public String getStudenID() {
        return studenID;
    }

    public void setStudenID(String studenID) {
        this.studenID = studenID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEducate() {
        return educate;
    }

    public void setEducate(String educate) {
        this.educate = educate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getMark10() {
        return mark10;
    }

    public void setMark10(String mark10) {
        this.mark10 = mark10;
    }

    public String getMark4() {
        return mark4;
    }

    public void setMark4(String mark4) {
        this.mark4 = mark4;
    }

}
