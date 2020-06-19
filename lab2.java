package projects;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student acc1 = new student("shashi","12345678");
      acc1.enroll("english");
      acc1.enroll("math");

	}

}
class student
{
	//properties
	String name;
	String ssn;
	private String email;
	private static int id = 123;
	private String userid;
	public String courses = "";
	private static final int costofcourse = 800;
	private  int bal = 0 ;
	public  student(String name , String ssn) // constructor doesent requires function data type
	{
		id++;
		this.name = name;
		this.ssn = ssn;
		set_userid();
		set_email();
	}
	private void set_email()
	{
		email = name.toLowerCase() + id + "@email.com"; // converting name to lowercase
		System.out.println("your new Email Id = " + email);
	bal = bal + costofcourse;
	}
private void set_userid()
{
int random = (int)(Math.random()* (9000 - 1000)*10); //  to set the range of the number = (max-min)*10	
random = random + 1000; // 1000 min range
userid = id + random + ssn.substring(6); 
System.out.println("userid = "+userid);
}
public void enroll(String course)
{
	this.courses = this.courses + " ["+ course +"] " ; 
	//System.out.println(courses);
	bal = bal + costofcourse;
	show_cources();
}
public void pay_tution()
{
	
}
public void check_bal()
{
 	System.out.println("balance = " +bal+ courses)  ;
}
public void show_cources()
{
	System.out.println("["+courses+"]");
}
@Override
public String toString()
{
	return "";
}
}
