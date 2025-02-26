import java.util.HashMap;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
	}
public static void swap(ArrayList<String> ArrL, int num, int num1){
String word = ArrL.get(num);
String word1 = ArrL.get(num1);
	ArrL.set(num1, word);
	ArrL.set(num, word1);
}

public static ArrayList<Double> createArrayList(double[] Arr){
ArrayList<Double> ArrLdouble = new ArrayList<Double>();
	for (int i = 0; i<Arr.length; i++){
ArrLdouble.add(Arr[i]);
}
return ArrLdouble;
	}


	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
HashMap <String, Integer> map = new HashMap <String, Integer>();
for (int i = 0; i<ages.length; i++){
	map.put(names[i], ages[i]);
}
return map;
	}

public static void increaseAge(HashMap<String, Integer> map, String name){
map.put(name, map.get(name)+1);
}
}
