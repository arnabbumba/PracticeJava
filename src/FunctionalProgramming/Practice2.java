package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class Practice2 {
	
	public static void main(String[] args) {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), 
        								asList("John", "Doe", "Third"));
        
        System.out.println(collection);
        
        System.out.println(collection.stream()
        	.flatMap(n -> n.stream())
        	.collect(Collectors.toList()));
        

	}

}
