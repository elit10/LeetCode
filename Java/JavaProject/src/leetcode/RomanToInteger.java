package leetcode;

import java.util.HashMap;

class RomanToInteger 
{
    private HashMap<Character,Integer> myMap = new HashMap<>();
    
    public RomanToInteger()
    {
        myMap.put('I', 1);
		myMap.put('V', 5);
		myMap.put('X', 10);
		myMap.put('L', 50);
		myMap.put('C', 100);
		myMap.put('D', 500);
		myMap.put('M', 1000);
    }
    
	public int romanToInt(String s)
	{

		int total = 0;
		
		for(int i = 0; i<s.length()-1; i++)
		{
			int val = myMap.get(s.charAt(i));
			if(val<myMap.get(s.charAt(i+1)))
			{
				total -= val;
			}
			else {total += val;}
			
		}
		
		total += myMap.get(s.charAt(s.length()-1));
		
	
		
		return total;
	}
	
	
	public static void main(String args[])
	{
		RomanToInteger C1 = new RomanToInteger();
		
		int val = C1.romanToInt("CCCXXIV");
		
		System.out.println(val);
	}

}