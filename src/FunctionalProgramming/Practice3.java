package FunctionalProgramming;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Person {

	private String name;
	private int age;
	private String nationality;

	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public Person(String name, int age) {
		this(name, age, "");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
	}


}

public class Practice3 {
	//}

	public static void main(String[] args) {
		Person sara = new Person("Sara", 4, "Bangali");
		Person viktor = new Person("Viktor", 40,"Bangal");
		Person eva = new Person("Eva", 42,"Bangali");
		Person anna = new Person("Anna", 5,"Bangal");
		List<Person> collection = asList(sara, eva, viktor, anna);
		//System.out.println(getOldestPerson(collection));
		//System.out.println(getKidNames(collection));
		//System.out.println(partitionAdults(collection));
		//partitionAdults(collection);
		//System.out.println(groupByNationality(collection));
		System.out.println(namesToString(collection));

	}


	public static String namesToString(List<Person> people) {
		
		return people.stream()
						.map(s -> s.getName())
						.collect(Collectors.joining(",","Names:","."));
	}


	public static Map<String, List<Person>> groupByNationality(List<Person> people) {

		return people.stream()
				.collect(Collectors.groupingBy(s -> s.getNationality()));
	}




	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {

		return people.stream()
				.collect(Collectors.partitioningBy(s -> s.getAge()>=18));
	}




	public static Set<String> getKidNames(List<Person> people) {

		return people.stream()
				.filter(s -> s.getAge()<18)
				.map(s -> s.getName())
				.collect(Collectors.toSet());
	}




	public static Person getOldestPerson(List<Person> people) {

		return people.stream()
				.max((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
				.get();
	}

}
