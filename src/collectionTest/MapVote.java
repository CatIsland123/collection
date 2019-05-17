package collectionTest;

import java.util.HashMap;
import java.util.Scanner;

public class MapVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []candidate= {1,2,3};
       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
       for(int i=0;i<3;i++) {
    	   map.put(candidate[i], 0);
       }
       
       Scanner in=new Scanner(System.in);
       Integer vote=in.nextInt();
       if(map.containsKey(vote)) {
    	   Integer t=map.get(vote);
    	   map.put(vote, ++t);
       }
       
       map.forEach((key, value) -> System.out.println(key + "    :    " + value));
       
	}

}
