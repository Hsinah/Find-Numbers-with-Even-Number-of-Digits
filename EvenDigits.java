import java.util.*;
class search_evendigits{
    public int findNumbers(int nums[])
    {
        int count=0;
        int len =nums.length;
        for(int i=0;i<len;i++)
        {
             int digcount=find_digit_count(nums[i]);
             if(digcount%2==0)
             {
                 count++;
             }
            
        }
        return count;
        
    }
    
        public static int find_digit_count(int digit)
        {
            if(digit==0)
            {
                return 1;
            }
            int local_count=0;
            while(digit!=0)
            {
                digit=digit/10;
                local_count++;
            }
            return  local_count;
        }
}

public class EvenDigits
{
    public static void main(String args[])
    {
        //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
        search_evendigits s= new search_evendigits();
        Scanner sc=new Scanner(System.in);
        int nums[] =new int[6];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<5;i++)
        {
            nums[i]=sc.nextInt();
        }
        
        System.out.println(""+s.findNumbers(nums));
    }
}