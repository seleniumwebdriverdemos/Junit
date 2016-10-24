import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//Step -One
@RunWith(Parameterized.class)
public class JunitParameterization {

//Step -Two Defining Parameters
String firstname;
String lastname;
String password;
int age;


//Step -Three Create constructor
public JunitParameterization(String firstname, String lastname,String password,int age){
	
	this.firstname=firstname;
	this.lastname=lastname;
	this.password=password;
	this.age=age;
}

@Parameters
public static Collection<Object[]> getData(){
	
	Object[][] data=new Object[2][4]; 
	
	data[0][0]="Kapilan";
	data[0][1]="Selva";
	data[0][2]="abc";
	data[0][3]=24;
	
	data[1][0]="Ahilan";
	data[1][1]="Selva";
	data[1][2]="xyz";
	data[1][3]=26;
	
	return Arrays.asList(data);
}

@Test
public void doLogin(){
	
	System.out.println(firstname + "---" + lastname + "---" + password + "---" + age);
}
}
