package max;

import java.util.HashMap;
import java.util.Map;

public class ATesting {


		public static void main(String[] args) {

		 
		    String st="This is is a A tree";
		    String []ar = st.split("\\s");
		    Map<String, Integer> mp= new HashMap<String, Integer>();
		    int count=0;
		 
		    for(int i=0;i<ar.length;i++){
		        count=0;
		 
		        for(int j=0;j<ar.length;j++){
		            if(ar[i].equals(ar[j])){
		            count++;                
		            }
		        }
		 
		        mp.put(ar[i], count);
		    }
		 
		    System.out.println(mp);
		
		}
}
