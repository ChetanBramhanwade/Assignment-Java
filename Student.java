import java.io.Serializable;

class Student implements Serializable {

	int id;
	String name;
	String subject;
	int marks;
	String result;

	public Student(int id, String name, String subject, int marks, String result) {

		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.result = result;
	}

	public  void resultdisplay(Student s) {
		if (s.marks > 16)
			s.result = "Pass";
		else
			s.result = "Fail";
	}
	
	public void display() {
		System.out.println(id + " " + name + " " + subject + " " + marks + " " + result);
	}
}
