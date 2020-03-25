
public class Person {
String name;
int age;

Person (String n, int a){
	name = n;
	age = a;
}

public static void main (String []args) {
	Person p = new Person("Bob", 50);
	System.out.println(p.name);
	p.name = "Bobert";
}
}
