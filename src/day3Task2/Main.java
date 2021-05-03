package day3Task2;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Ali", 1, 15);
		
		Instructor instructor1 = new Instructor();
		instructor1.name= "Selim ";
		instructor1.adminNumber= 77;
		instructor1.age = 25;
		
		
		Student student1 = new Student();
		student1.schoolNumber = 27;
		student1.name = "Talha";		
		
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.assign(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
	}

}
