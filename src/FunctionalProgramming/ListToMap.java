package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,3,5,1);
		Map<Integer, Integer> map = list.stream()
										.collect(Collectors.toMap(o -> o, o -> o));
		System.out.println(map);
	}

}
