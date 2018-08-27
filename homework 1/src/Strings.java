import java.util.HashMap;
import java.util.Map;


public class Strings 
{
	public static String uniqueLetters(String str)
	{
		
		HashMap<Character, Integer> map = new HashMap<>();	
		String word = "";
		
		
		for(int i = 0; i < str.length(); i++)
		{
			char currentLetter = str.charAt(i);
			
			
			if(map.containsKey(currentLetter))
			{
				map.put(currentLetter , map.get(currentLetter) +1 );
			} 
			else 
				map.put(currentLetter, 1);
		}
		
		
		
		for(int i = 0; i < str.length(); i++)
		{
			if(map.get(str.charAt(i))==1)
			{
				word = word + str.charAt(i);
			}
	    }
		
		return word;
	}
		

}
		
		
		
	


