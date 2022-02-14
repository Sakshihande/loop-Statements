package com.inheritance;

public class Poly1 {
	private String name;
	private String course;
	private double avg;
	public Poly1(String name,String course) {
		this.name=name;
		this.course=course;
		
	}
	public void getData(int marks1,int marks2) {
		double total=marks1+marks2;
		avg=(total/200)*100;
		
	}
	public void display(double d) {
		System.out.println("Roll.No:"+d);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
		System.out.println("Percentage:"+avg);
	}

}
