package com.kn.Object1;

public class StudentApp {

	public static void main(String[] args) 
	{
		Student[] srr = StudentUtility.studentObjectCreation(3);
		StudentUtility.searchStudentById(srr, 2);
//		int position = StudentUtility.searchStudentById(srr, 2);
//		if(position>=0)
//		{
//			System.out.println("Student found at "+position);
//		}
//		else
//		{
//			System.out.println("Student not found");
//		}
		StudentUtility.searchStudentByName(srr,"Amit");
		StudentUtility.SearchStudentByNameUsingBinarySearch(srr,"Amit");
		StudentUtility.applyGraceMarks(srr);
		StudentUtility.sortStudentByIdAscending(srr);
		StudentUtility.sortStudentByIdDescending(srr);
		StudentUtility.sortStudentByNameAscending(srr);
		StudentUtility.sortStudentByNameDescending(srr);
		StudentUtility.rateApplication(srr, 2);
	}

}
