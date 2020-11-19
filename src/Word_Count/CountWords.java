package Word_Count;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountWords 
{

   public static void main(String[] args) throws IOException   {
		String contents = null;
		//String filePath = "/home/soumyaranjan/soumya/s.txt/p3_1.txt";
		//contents = new String(Files.readAllBytes(Paths.get(filePath)));
		contents="My name is Soumyaranjan Pati and my father name is Ranjan kumar Pati";
		System.out.println("Before Split..............");
		
		contents=contents.toLowerCase();
		System.out.println(contents);
      String[] words=contents.split(" "); 

    Map<String,Integer>m=new HashMap<String,Integer>();
     for(String s:words) {
    	  if(m.containsKey(s)) {
    		  m.put(s, (Integer)m.get(s)+1);
    	  }
    	  else {
    		  m.put(s, 1);
    	  }
      }
      System.out.println(m);
      for(String s:m.keySet()) {
    	System.out.println(  s+": "+m.get(s));
      }
   }

}