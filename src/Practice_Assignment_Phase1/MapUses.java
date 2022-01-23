package Practice_Assignment_Phase1;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapUses {

	public static void main(String[] args) {
		// map
		
				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Tom");    
			      hm.put(2,"jerry");    
			      hm.put(3,"Catie");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Entry<Integer, String> m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Alex");  
			      ht.put(5,"Rose");  
			      ht.put(6,"Gorge");  
			      ht.put(7,"Jhon");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Entry<Integer, String> n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"Annie");    
			      map.put(9,"kington");    
			      map.put(10,"Cutie");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Entry<Integer, String> l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    

		

	}

}
