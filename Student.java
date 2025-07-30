package ageena;
class Student1{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student1(int rollNumber,String name,int m1,int m2,int m3)
	{
	   this.rollNumber=rollNumber;
   	   this.name = name;
	   this.m1 = m1;
	   this.m2 = m2;
	   this.m3 = m3;
	}
	public void calculateAverage() 
	   {
		 avg=(m1+m2+m3)/3.0f;
		
	   }
	public void displayDetails() {
		System.out.println("rollNumber"+rollNumber);
		System.out.println("name"+name);
		System.out.println("Mark 1"+ m1+",Mark 2"+ m2 +",Mark 3"+ m3);
		System.out.println("Average:"+avg);
	}
}
public class Student{
	public static void main(String[]args) {
		Student1 student1=new Student1(20,"Ammu",56,68,59);
		     student1.calculateAverage();	
		     student1.displayDetails();
			
		Student1 student2=new Student1(21,"chinnu",56,70,50);
		student2.calculateAverage();
		student2.displayDetails();
		
	}                                                                                                              
}