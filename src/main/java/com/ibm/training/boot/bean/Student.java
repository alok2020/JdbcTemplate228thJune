package com.ibm.training.boot.bean;

import java.sql.Date;

public class Student 
{
int studentCode,deptCode;
String studentName,address;
Date date;
public int getStudentCode() {
	return studentCode;
}
public void setStudentCode(int studentCode) {
	this.studentCode = studentCode;
}
public int getDeptCode() {
	return deptCode;
}
public void setDeptCode(int deptCode) {
	this.deptCode = deptCode;
}
//public String getStudentName() {
//	return studentName;
//}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Student [studentCode=" + studentCode + ", deptCode=" + deptCode + ", studentName=" + studentName
			+ ", address=" + address + ", date=" + date + "]";
}
public Student(int studentCode, int deptCode, String studentName, String address, Date date) {
	super();
	this.studentCode = studentCode;
	this.deptCode = deptCode;
	this.studentName = studentName;
	this.address = address;
	this.date = date;
}
	public Student()
	{
		
	}
	public String getStudentName() {
		// TODO Auto-generated method stub
		return studentName;

	}
}
