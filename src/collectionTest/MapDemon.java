package collectionTest;
import java.util.HashMap;
import java.util.Iterator;

import collectionTest.student2;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemon {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map<student2,String>map=new HashMap<student2,String>();
         String addr="福建福州市";
         map.put(new student2("Liua",20), addr);
         map.put(new student2("Nic",21), addr);
         map.put(new student2("Aane",21), addr);
         map.put(new student2("Aane",21), addr);
         //使用keySet
         
          Set<student2> keyset=map.keySet();
          Iterator it=keyset.iterator();
          while(it.hasNext()) {
        	  student2 st=(student2) it.next();
        	  System.out.println(st+"地址："+map.get(st));
          }
         System.out.println();
          //使用entry
         /*
          Iterator it1=map.entrySet().iterator();     
          while(it1.hasNext()) {
		  Map.Entry<student2, String>entry=(Entry<student2, String>) it1.next();
          System.out.println(entry.getKey()+" "+entry.getValue());
          }
          */
          for(Map.Entry<student2, String> entry:map.entrySet()) {
        	  System.out.println(entry.getKey()+" "+entry.getValue());
          }
           
	}

	

}
