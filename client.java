class Client {

private String name="";
private int age = 0;
private static int nClient=0;
private String ClientID = "";
private static int accBalance = 0;
private static int savings = 0;


Client(String n, int a) {
	name = n;
	age = 0;
	nClient++;
	ClientID = "CL"+age*3+name.length();
}

public static int withdraw(int a) {
	accBalance -= a;
	return accBalance;
}
public static int deposit(int a) {
	accBalance += a;
	return accBalance;
}
public String toString() {
	return "name: "+name+'\n'+"age: "+age+'\n'+"ID: "+ClientID+'\n'+"Balance: "+accBalance;
}

}
