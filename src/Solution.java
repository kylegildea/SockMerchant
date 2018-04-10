import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) 
    {
		HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>(n);
		
		for(int i = 0; i < n; i++)
		{
			socks.put(ar[i], 0);
		}
		
		for(int i = 0; i < n; i++)
		{
			socks.put(ar[i], socks.get(ar[i]) + 1);
		}
		
		int sellable = 0;
		
		for(Map.Entry<Integer, Integer> entry:socks.entrySet())
		{
			sellable +=(entry.getValue() / 2);
		}
		return sellable;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
