package leetcode;

class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs)
	{
		String val = "";
		
		for(int i = 0; i< strs[0].length();i++)
		{
			// index for char
			boolean willAdd = true;
			char curChar = ' ';
			try
			{
				curChar = strs[0].charAt(i);
				for(int j = 0; j<strs.length;j++)
				{
					//index for words
					if(strs[j].charAt(i) != curChar)
					{
						willAdd = false; return val;
					}
				}
			}
			catch(Exception e)
			{
				return val;
			}

			if(willAdd) {val += curChar;}
		}
		
		return val;
	}
	
	
	
	public static void main(String args[])
	{
		String[]val = {"flower,flame","flight"};
		
		System.out.println(longestCommonPrefix(val));
	}
	
}