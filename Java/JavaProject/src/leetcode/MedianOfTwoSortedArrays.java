package leetcode;

public class MedianOfTwoSortedArrays 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	
    	int[] newArray = new int[len1+len2];
    	
    	int i = 0,k=0,j=0;
    	
    	while(i<len1+len2)
    	{
    		
    		System.out.println(k + " " + j + " " + i);
    		
    		if(k>len1-1 && j>len2-1)
    		{
    			break;
    		}
    		
    		if(k == len1)
    		{
    			newArray[i] = nums2[j];
    			j++;
    			i++;
    			continue;
    		}
    		if(j == len2 )
    		{
    			newArray[i] = nums1[k];
    			k++;
    			i++;
    			continue;
    		}
    		
    		
    		
    		int val1 = nums1[k];
    		int val2 = nums2[j];
    		
    		//System.out.println(val1 + " " + val2);
    		
    		if(val1 >= val2)
    		{
    			newArray[i] = val2;
    			j++;
    		}
    		if(val2>val1)
    		{
    			newArray[i] = val1;
    			k++;
    		}
    		
    		i++;
    	}
    	
    	if(newArray.length %2 == 1)
    	{
    		return newArray[newArray.length/2];
    	}
    	else
    	{
    		return (double)(newArray[newArray.length/2] + newArray[newArray.length/2-1]) /2;
    	}
    }
    
    
    public static void main(String args[])
    {
    	MedianOfTwoSortedArrays C1 = new MedianOfTwoSortedArrays();
    	
    	int[] nums1 = {1,3};
    	int[] nums2 = {2};
    	
    	double num = C1.findMedianSortedArrays(nums1, nums2);
    	
    	System.out.println(num);
    	
    }
    
    
}
