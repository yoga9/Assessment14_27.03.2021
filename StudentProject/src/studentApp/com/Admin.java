package studentApp.com;
import java.util.Set;
import java.util.TreeSet;

public class Admin {

    final static int adminId = 101;
    final static String adminName = "Yogi";
	
 public static void main(String[] args) {
	
	System.out.println("AdminId :"+adminId+ " " +"AdminName :"+adminName);
	
	Teacher T = new Teacher(1,"V11","Vee1");
	Teacher T1 = new Teacher(2,"V13","Vee2");
	Teacher T2 = new Teacher(4,"V15","Vee4");
	Teacher T3 = new Teacher(3,"V14","Vee3");
	Teacher T4 = new Teacher(5,"V12","Vee3");
	
	Set<Teacher> obj = new TreeSet<Teacher>();
	
	obj.add(T);
	obj.add(T1);
	obj.add(T2);
	obj.add(T3);
	obj.add(T4);
	
	System.out.println("Username and password for Teacher's class");
	
	for(Teacher obj1 : obj) {
		System.out.println(obj1.teacherId+ " "+obj1.username+ " "+obj1.password);
	}
	
	System.out.println("Chk if the password is matches or not");
	
	System.out.println("The Username of Teacher :");
    System.out.println(T4.username);
	System.out.println("The password of Teacher :");
	System.out.println(T4.password); 
	    
		if(!equals(T3.password,T4.password))  {
			System.out.println(T4.username + ":" +"User not able to login");
			}
			else {
				System.out.println(T4.username + ":" +"Login Successfully");
			}
}

private static boolean equals(String password1, String password2) {
	// TODO Auto-generated method stub
	return false;
}
}
		

