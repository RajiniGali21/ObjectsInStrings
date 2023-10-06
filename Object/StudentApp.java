package com.kn.Object;

import java.util.Scanner;

public class StudentApp
//{
//	public static void main(String[]args)
//	{
//Student s1 = new Student(01,"Amit",97);
//Student s2 = new Student(02,"Amitha",99);
//Student s3 = new Student(03,"Aju",95);
//Student[] srr = new Student[3];
//System.out.println(srr[0]);
//srr[0]=s1;
//srr[1]=s2;
//srr[2]=s3;
//System.out.println("ID = "+srr[0].id+" "+"NAME = "+srr[0].name+" "+"MARKS = "+srr[0].marks);
//System.out.println("ID = "+srr[1].id+" "+"NAME = "+srr[1].name+" "+"MARKS = "+srr[1].marks);
//System.out.println("ID = "+srr[2].id+" "+"NAME = "+srr[2].name+" "+"MARKS = "+srr[2].marks);
//	}
//}
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of student objects to be created = ");
		Student[] srr = new Student[sc.nextInt()];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("enter id for student = "+(i+1)+" = ");
			int id = sc.nextInt();
			System.out.println("enter name for student = "+(i+1)+" = ");
			String name = sc.next();
			System.out.println("enter marks for student = "+(i+1)+" = ");
			int marks = sc.nextInt();
			Student s = new Student(id,name,marks);
			srr[i]=s;
		}
		for(Student s:srr)
//		{
//			if(s.name.equals("raji"))
//		System.out.println("ID = "+s.id+" NAME = "+s.name+" MARKS = "+s.marks);
//		}
		if(s.marks<35)
		{
			int grace = 35-s.marks;
			System.out.println("ID = "+s.id+" NAME = "+s.name+" MARKS = "+s.marks);
			System.out.println("*****After grace****");
			System.out.println("Grace marks = "+(s.marks + grace));
		}
		sc.close();	
			
		
	}
}




