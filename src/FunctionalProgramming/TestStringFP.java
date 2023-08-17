package FunctionalProgramming;

import java.util.List;

public class TestStringFP {

	public static void main(String[] args) {
		
		List<String> list = List.of("Apple","Bat","Cat","Dog");
		//printBasic(list);
		//printBasicFP(list);
		//printBasicFilter(list);
		printBasicFilterFP(list);
		
	}
	
	public static void printBasic(List<String> list) {
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	public static void printBasicFilter(List<String> list) {
		for(String s:list) {
			if(s.endsWith("at")) {
				System.out.println(s);
			}
		}
	}
	
	public static void printBasicFP(List<String> list) {
		list.stream()
			.forEach(
					element -> System.out.println(element)
					);
					
	}
	
	public static void printBasicFilterFP(List<String> list) {
		list.stream()
			.filter(
					element -> element.endsWith("at")
					)
			.forEach(
					element -> System.out.println(element)
					);
	}

}
