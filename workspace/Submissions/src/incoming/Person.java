package incoming;

import java.util.Date;

// Class is the cookie-cutter
// The object is the cookie
// The memory is the cookie dough
// Here we're defining a type (i.e., a class)
public class Person {
	String name;
	Date birthday;
	// this defines a type
	enum Gender {
		// the options for gender
		MALE, FEMALE, NOT_SPECIFIED;
		
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
	};
	// this defines a variable of type Gender
	Gender gender;
	// A constructor is a method that initializes the object
	Person(String name, Date birthday, Person.Gender sex) {
		this.name = name;
		this.birthday = birthday;
		gender = sex;
	}
	public String toString() {
		return name + ", a " + gender + " was born on " + birthday;
	}
	
	public static void main(String[] args) {
		// Here we're creating objects of type Person
		// new is how we allocate memory to an object
		Person me = new Person("Joey", new Date(81,3,7), Person.Gender.MALE);
		
		// This line...
		Person you = new Person("You", new Date(), Person.Gender.NOT_SPECIFIED);
		// ... is the same as these lines...
		you.birthday = new Date();
		you.gender = Person.Gender.NOT_SPECIFIED;
		you.name = "You";
		
		System.out.println(me);
		System.out.println(you);
	}
}
