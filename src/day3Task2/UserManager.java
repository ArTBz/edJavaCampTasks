package day3Task2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.name);
	}
	
	public void remove(User user) {
		System.out.println("Kullanıcı kaldırıldı : " + user.name);
	}

}
