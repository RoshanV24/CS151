import java.util.*;

public class Encoding
{
	
	public static void allCombos(int numDots, int numDashes, String temp, Set<String> res)
	{
		if(numDots == 0 && numDashes == 0)
		{
			res.add(temp);
			return;
		}
		
		if(numDots > 0)
		{
			String newTemp = temp + ".";
			allCombos(numDots-1,numDashes,newTemp,res);
		}
		
		if(numDashes > 0)
		{
			String newTemp = temp + "-";
			allCombos(numDots,numDashes-1,newTemp,res);
		}
	}
	
	
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      String tempString = "";
      allCombos(m,n,tempString,result);
      
      return result;
   }
   
}
