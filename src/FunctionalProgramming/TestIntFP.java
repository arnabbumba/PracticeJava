package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class TestIntFP {

	public static void main(String[] args) {
		List<Integer> list = List.of(3,1,8,5,90,54,34,78,55,33,5,3);
		//printFP(list);
		//printOddFP(list);
		//prinfEvenFP(list);
		//printSortedFP(list);
		//printSquareofAllDistinct(list);
		printMaxMin(list);
		
	}
	
	private static void printMaxMin(List<Integer> list) {
		System.out.println("Maximum is:"+list.stream()
			.max((n1,n2) -> Integer.compare(n1, n2))
			.orElse(0)
			);
		System.out.println("Minimum is:"+list.stream()
			.min((n1,n2) -> Integer.compare(n1, n2))
			.get()
			);
	}

	private static void printSquareofAllDistinct(List<Integer> list) {
		/*
		 * list.stream() .distinct() .sorted() .map(e -> e*e ) .forEach(e ->
		 * System.out.print(e+"  "));
		 */
		
		List<Integer> l = list.stream()
								.distinct()
								.sorted()
								.map(e -> e*e)
								.collect(Collectors.toList());
		System.out.println(l);
	}

	public static void printFP(List<Integer> list) {
		list.stream()
			.forEach(
					element -> System.out.print(element+"  ")
					);
		
		int sum = list.stream()
						.reduce(
								0, (n1,n2)-> n1+n2
								);
		System.out.println("\nSum is:"+sum);
	}
	
	public static void printOddFP(List<Integer> list) {
		list.stream()
			.filter(
					e -> e%2!=0
					)
			.forEach(
					e -> System.out.print(e+"  ")
					);
		
		int sum = list.stream()
						.filter(e -> e%2!=0)
						.reduce(0, (n1,n2)-> n1+n2);
		System.out.println("\nSum is:"+sum);
	}
	
	public static void prinfEvenFP(List<Integer> list) {
		list.stream()
			.filter(e -> e%2 == 0)
			.forEach(e -> System.out.print(e+"  ")
					);
		
		int sum = list.stream()
						.filter(e -> e%2 == 0)
						.reduce(0, (n1,n2) -> n1+n2);
		
		System.out.println("\nSum is:"+sum);
	}
	
	public static void printSortedFP(List<Integer> list) {
		/*
		 * list.stream() .distinct() .sorted() .forEach(e -> System.out.print(e+" "));
		 */
		
		List<Integer> l = list.stream()
			.distinct()	
			.sorted()
			.collect(Collectors.toList());
		
		System.out.println(l);
	}

}
