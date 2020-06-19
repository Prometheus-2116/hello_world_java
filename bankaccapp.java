package projects;

public class bankaccapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bankaccount acc1 = new bankaccount("234576631",100000);
bankaccount acc2 = new bankaccount("432376987",345678);
//bankaccount acc3 = new bankaccount("234576631");	
acc1.Set_name("shashi");
	//System.out.println(acc1.get_name());
	acc2.Set_name("shashidhara");
	//System.out.println(acc2.get_name());
	acc1.makedeposit(400);
	acc2.makedeposit(500);
	
	acc1.pay_bill(200);
	acc2.pay_bill(400);
	
	acc1.accrue();
	System.out.println(acc1.toString()) ;
	System.out.println(acc2.toString());
	}

}

class bankaccount implements Iinterest{
	
	//properties of banck acc 
private String acccno; //id + random-2digit no +f dirst 2 of ssn
private static final  String routinno = "23456789";
private String name;
private String ssn;
double bal;
private static int id=100;

//constructors
public bankaccount(String ssn,double initdeposit) 
{
	bal = initdeposit;
	this.ssn = ssn;  
	System.out.println("new account created");
	id++;
	set_acccno();
	//System.out.println(id);
}
private void set_acccno()
{
	int random = (int) (Math.random() * 100 );

	acccno =  id + "" + random + ssn.substring(0,1);
	System.out.println(acccno + "\n");
	
}
public void Set_name(String name)
{
this.name = name;	

}
public String get_name()
{
	System.out.print("name = ");
	return name;
}
public void pay_bill (double amt)
{
	bal = bal - amt;
	boolean pay = true;
	System.out.print("balance after paying the bill \n");show_bal();
}
public void makedeposit(double amt)
{
	bal = bal + amt;
	System.out.print("balance after deposit \n" );show_bal();
}
public void show_bal()
{
System.out.println("balance = " + bal + "\n");
	
}
@Override
public void accrue() {
	// TODO Auto-generated method stub
	bal = bal * (1+rate/100);
	show_bal();
}
@Override
public String toString() {
return "  \n [name: "+ name+ " ] \n [account number : " + acccno + " ]\n [routing number: "+ routinno+" ] \n [balamce : "+bal+"]";  
}
}
