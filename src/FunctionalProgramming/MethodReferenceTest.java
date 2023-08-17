package FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceTest {
	
	public static boolean calculate(int n) {
		return (n%2==0) ;
	}

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Cat","Dog","Elephant");
		
		/*
		 * list.stream() .map(s -> s.length()) .forEach(s->System.out.println(s));
		 */
		
		/*
		 * list.stream() .map(String::length) .forEach(System.out::println);
		 */
		
		
		  Predicate<Integer> evenPredicate = n -> n%2 ==0;// Assign function in to a variable 
		  
		  int max = List.of(23,83,99,78).stream()
				  						.sorted()
				  						//.filter(n -> n%2 ==0)// passing function to method
				  						//.filter(evenPredicate) // Assign function to a variable
				  						.filter(evenPredicateFunc()) // returning function from methods
				  						.max((n1,n2)-> Integer.compare(n1,n2))
				  						.orElse(0);
		 
		
		/*
		 * int max = List.of(23,83,99,78).stream() .sorted()
		 * .filter(MethodReferenceTest::calculate) .max(Integer::compare) .orElse(0);
		 */
		System.out.println(max);
	}
	
	public static Predicate<Integer> evenPredicateFunc(){
		return n -> n%2 ==0;
	}

}
