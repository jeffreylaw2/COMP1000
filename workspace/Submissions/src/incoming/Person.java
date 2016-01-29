package incoming;

import java.util.Date;

//Classs is the cookie-cutter
// The object is the cookie
// memory is the cookie dough
//Here we are defining a type (i.e class0
public class Person {
	String name;
	Date birthday;
	// this defines a type
	enum Gender { MALE, FEMALE, NOT_SPECIFIED;
	// this defines a variable of type Gender
	public String toString() {
		
		if (this == Person.Gender.MALE) {
			return "male";
		} else if (this == Person.Gender.FEMALE) {
			return "female";
		} else if (this == Person.Gender.NOT_SPECIFIED) {
			return "unknown";
	    }
		return null;
		}
	}
	
	Gender gender;
	//A constructor initializes the object
	Person(String name, Date birthday, Person.Gender sex) {
		this.name = name;
		this.birthday = birthday;
		gender = sex;
		
	}
	
	
	
	public static void main(String[] args) {
		// Here we're creating objects of type Person
		// new is how we allocate memory to an object
		Person me = new Person("Joey", new Date(), Person.Gender.NOT_SPECIFIED);
		me.name = "Joey Lawrance";
		me.birthday = new Date();
		me.gender = Person.Gender.MALE;
	//This line...
		Person you = new Person("Jeffrey", new Date(),Person.Gender.NOT_SPECIFIED);
		you.birthday = new Date ();
		you.gender = Person.Gender.NOT_SPECIFIED;
		you.name = "You";
		
		System.out.println(me);
		System.out.println(you);
		
	}
}
