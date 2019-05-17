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
       for(int j=0;j<10;j++) {
    	   for(int k=0;k<2;k++) { 
    		    System.out.println(j+":请输入您所选择的候选人号码：");
                Scanner in=new Scanner(System.in);
                Integer vote=in.nextInt();
                if(vote>3||vote<0) {
                	System.out.println(j+":请重新输入您所选择的候选人号码：");
                    Scanner in1=new Scanner(System.in);
                    Integer vote1=in1.nextInt();
                }
                if(map.containsKey(vote)) {
    	        Integer t=map.get(vote);
    	        map.put(vote, ++t);
       }
       }
       }
       map.forEach((key, value) -> System.out.println(key + "    :    " + value));
       
	}

}
