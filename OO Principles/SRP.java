
public class SRP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Greg");
		Dog dog = new Dog();
		
		human.throwStick();
		dog.fetchStick();
		human.walk();
		dog.bark();
	}
}

class Human{
	public Human(String name) {
		_name = name;
	}

	public void throwStick(){
		System.out.println(_name + " is throwing a stick");
	}
	
	public void walk(){
		System.out.println("I'm walking");
	}
	
	String _name;
}

class Dog{
	public void fetchStick(){
		System.out.println("I'm fetching a stick");
	}
	
	public void bark(){
		System.out.println("Woof! ");
	}
}