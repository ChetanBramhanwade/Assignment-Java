import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentWriteObject {
	
	public static void main(String[] args) throws IOException ,EOFException {
		
		Student s1 = new Student(101,"Chetan","java",45,null);
		Student s2 = new Student(102,"Yash","C++",40,null);
		Student s3 = new Student(103,"Ravi","Python",16,null);
		Student s4 = new Student(104,"Piyush","DBDA",28,null);
		Student s5 = new Student(105,"Rohit","java",14,null);
		
		FileOutputStream fo = new FileOutputStream("StudentData.csv");	
		ObjectOutputStream objo= new ObjectOutputStream(fo);
		
		objo.writeObject(s1);
		objo.writeObject(s2);
		objo.writeObject(s3);
		objo.writeObject(s4);
		objo.writeObject(s5);
		
		System.out.println("Student object is written into the file ");
		objo.close();
		fo.close();
	}
	
	
}
