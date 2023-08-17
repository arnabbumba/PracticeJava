package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Practice0808_01 {
	
	//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	public static void findEven(List<Integer> list) {
		list.stream()
		.filter( i -> (i %2 ==0))
		//.forEach(System.out::print);
		.forEach(s->System.out.print(s+" , "));
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,13,4,5,162,7,8,9,10);
		//findEven(list);
		//startWith1(list);
		startWith1another(list);
	}
	
	//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	public static void startWith1(List<Integer> list) {
		list.stream()
			.filter(s -> s.toString().startsWith("1"))
			.forEach(s->System.out.print(s+" , "));
	}
	public static void startWith1another(List<Integer> list) {
		list.stream()
			.map(s -> s+"")
			.filter(s -> s.startsWith("1"))
			.forEach(s->System.out.print(s+" , "));
	}
}
