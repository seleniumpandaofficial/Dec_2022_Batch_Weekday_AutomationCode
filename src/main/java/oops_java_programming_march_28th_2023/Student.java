package oops_java_programming_march_28th_2023;
//Mechanism of wrapping data (variables/methods) together into a single unit

//Steps to achieve encapsulation

//1. Declare the variables as private [this is known as data hiding]
// 2. Provide the setter and getter method to modify and view the data

// https://www.javatpoint.com/encapsulation

public class Student {
	
private String student_name;
private int student_id;

public void setData(String name, int id) {
	student_name = name;
	student_id = id;
}

public String getData() {
	return student_name;
}

public int getData1() {
	return student_id;
}

}
