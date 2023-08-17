package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterForEachMapDemo {
	
	public static class MyPredicate implements Predicate<Integer>{

		@Override
		public boolean test(Integer t) {
			return t%2 ==0;
		}
		
	}
	
	public static class MyConsumer implements Consumer<Integer>{

		@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
		
	}
	
	public static class MyFunction implements Function<Integer, Integer>{

		@Override
		public Integer apply(Integer t) {
			return t * t;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		/*
		 * List.of(23,34,55,79,36) .stream() .filter(e -> e%2 ==0) .forEach(e ->
		 * System.out.print(e+" "));
		 */
		
		List.of(23,34,55,79,36)
		.stream()
		.filter(new MyPredicate())
		.map(new MyFunction())
		.forEach(new MyConsumer());
	}

}
