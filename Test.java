import java.util.*;

class Person{
	private String name;
	private String occupation;
	int age;
	Person(String nm, String occ,int ag){
		this.name=nm;
		this.occupation=occ;
		this.age=ag;
	}
	void Display(){
		System.out.print( name + " " + occupation + " " + age);
	}	
}

class Student extends Person {
	private int fees;
	
	Student(String name, String occupation, int age ,int fees){
		super(name,occupation,age);
		this.fees=fees;
	}
	
	void Display(){
		super.Display();
		System.out.print(" "+fees);
	}
	
}

class Test{
	public static void main(String[] args){
		Student obj = new Student("Abhinav","Student",20,200000);
		obj.Display();

	}
		

}
