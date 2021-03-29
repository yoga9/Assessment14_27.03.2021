package studentApp.com;

public class Teacher implements Comparable<Teacher> {

	 int teacherId;
     String username;
     String password;
	public Teacher(int teacherId, String username, String password) {
		super();
		this.teacherId = teacherId;
		this.username = username;
		this.password = password;
	}
	public int compareTo(Teacher b) { 
		
	    if(teacherId>b.teacherId){  
	        return 1;  
	    }
	    else if(teacherId<b.teacherId){  
	        return -1;  
	    }
	    else{  
	    return 0;  
	    }  
	}
}
