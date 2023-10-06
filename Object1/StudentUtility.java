package com.kn.Object1;

import java.util.Scanner;

public class StudentUtility 
{
	public static Student[] studentObjectCreation(int n)
	{
		Scanner sc = new Scanner(System.in);
		Student[] srr = new Student[n];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("data for student "+(i+1));
			System.out.println("enter ID = ");
			int id = sc.nextInt();
			System.out.println("enter name = ");
			String name = sc.next();
			System.out.println("enter marks = ");
			int marks = sc.nextInt();
			srr[i]=new Student(id,name,marks);
		}
			sc.close();
			return srr;
		}
public static int searchStudentById(Student srr[],int id) {
	System.out.println("---------------------------------------------------");
	int c = 0;
	for (int i = 0; i < srr.length; i++) {
		if (srr[i].id == id) {
			c = 1;
			System.out.println("ID = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
			break;
		}
	}
	if (c == 0) {
		System.out.println(id + "Not Found");
	}
	return c;
}

public static void searchStudentByName(Student srr[],String name) {
	int c = 0;
	for (int i = 0; i < srr.length; i++) {
		if (srr[i].name.equals(name)) {
			c = 1;
			System.out.println("ID = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
			break;
		}
	}
	if (c == 0) {
		System.out.println(name + "Not Found");
	}
}
public static void SearchStudentByNameUsingBinarySearch(Student[] srr,String target)
{
	Student[] srr1 = sortStudentByIdAscending(srr);
	int index=-1;
	int low=0;
	int high = srr1.length;
	while(low<=high)
	{
		int mid = (low+high)/2;
		if(srr1[mid].name.equalsIgnoreCase(target))
		{
			index=mid+1;
			break;
		}
		else if(srr1[mid].name.compareTo(target)<0)
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
}

public static void applyGraceMarks(Student srr[]) {
	System.out.println("----------------------Grace Marks-----------------------");
	for (Student s : srr) {
		if (s.marks < 35) {
			int grace = 35 - s.marks;
			System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);
			System.out.println("Grace Marks = " + grace);
			System.out.println("Final Marks =" + (s.marks + grace));
		}
	}
}
public static Student[] sortStudentByIdAscending(Student srr[])
{
	System.out.println("---------------------------------------------------");
	for (int i = 0; i < srr.length; i++)
	{
		int count = 0;
		for (int j = 0; j < srr.length - 1 - i; j++)
		{
			if (srr[j].id > srr[j + 1].id)
			{
				
				Student temp = srr[j+1];
				srr[j+1]=srr[j];
				srr[j]=temp;
				count = 1;

			}
		}
		if (count == 0)
			break;
	}
	System.out.println("Studnet Details in Ascending Order Of Id");
	for(Student s : srr)
	{
		System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
	}
	return srr;
}
public static void sortStudentByIdDescending(Student srr[])
{
	System.out.println("---------------------------------------------------");
	for (int i = 0; i < srr.length; i++)
	{
		int count = 0;
		for (int j = 0; j < srr.length - 1 - i; j++)
		{
			if (srr[j].id < srr[j + 1].id)
			{
				
				Student temp = srr[j+1];
				srr[j+1]=srr[j];
				srr[j]=temp;
				count = 1;

			}
		}
		if (count == 0)
			break;
	}
	System.out.println("Studnet Details in Descending Order Of Id");
	for(Student s : srr)
	{
		System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
	}
}
public static void sortStudentByNameAscending(Student srr[])
{
	System.out.println("---------------------------------------------------");
	for (int i = 0; i < srr.length; i++)
	{
		int count = 0;
		for (int j = 0; j < srr.length - 1 - i; j++)
		{
			if ((srr[j].name.compareTo(srr[j + 1].name))>0)
			{
				
				Student temp = srr[j+1];
				srr[j+1]=srr[j];
				srr[j]=temp;
				count = 1;

			}
		}
		if (count == 0)
			break;
	}
	System.out.println("Studnet Details in Ascending Order Of Name");
	for(Student s : srr)
	{
		System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
	}
}
public static void sortStudentByNameDescending(Student srr[])
{
	System.out.println("---------------------------------------------------");
	for (int i = 0; i < srr.length; i++)
	{
		int count = 0;
		for (int j = 0; j < srr.length - 1 - i; j++)
		{
			if ((srr[j].name.compareTo(srr[j + 1].name))<0)
			{
				
				Student temp = srr[j+1];
				srr[j+1]=srr[j];
				srr[j]=temp;
				count = 1;

			}
		}
		if (count == 0)
			break;
	}
	System.out.println("Studnet Details in Descending Order Of Name");
	for(Student s : srr)
	{
		System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
	}
}

public static void rateApplication(Student srr[],int rating)
{
	
	if(rating<1 && rating>5)
	{
		System.out.println("Invalid Input");
	}
	else
	{
		for(int i=1;i<=rating;i++)
		{
			System.out.print("*");
		}
	}
}
}


	


