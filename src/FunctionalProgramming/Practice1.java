package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Practice1 {
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        List<String> l = Arrays.asList(names);
        int m = (int) l.stream().map(s-> s.length()).filter(s -> s> 5).reduce(0, (n1,n2)->n1+n2);
        
	return m;
}


	public static void main(String[] args) {
		System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
	    int n = getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
	    
	    System.out.println(n);

	    System.out.println("Testing if [aaron] returns 0");
	    int m = getTotalNumberOfLettersOfNamesLongerThanFive("aaron");
	    System.out.println(m);
	}

}
