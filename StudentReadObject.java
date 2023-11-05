import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentReadObject {

	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException ,EOFException {
		
		FileInputStream fi = new FileInputStream("StudentData.csv");
		ObjectInputStream obji = new ObjectInputStream(fi);
		
		Student s;
		while((s=(Student)obji.readObject())!=null) {
			s.resultdisplay(s);
			s.display(); 
			 
		}
		
		obji.close();
		fi.close();
	}
}
   