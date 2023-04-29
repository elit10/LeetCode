package leetcode;

class ReverseString 
{
	public static String reverseString(char[] s) 
	{
        for(int i = 0; i< (s.length+1)/2;i++)
        {
        	char c1 = s[i];
        	char c2 = s[s.length-1 - i];
        	
        	s[i] = c2;
        	s[s.length-1 -i ] = c1;
        }
        
        return String.valueOf(s);
        
    }
	
	public static void main(String args[])
	{
		String myStr = "Hello World";
		
		
		System.out.println(reverseString(myStr.toCharArray()));
		
	}
}
