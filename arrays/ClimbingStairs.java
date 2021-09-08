package com.java.arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(climbingStairs(5));
			climb_Stairs(0, 3);
		
	}
	
	/* To reach n steps, how many ways we can reach
	 * if n=3 => 1 step+ 1 step+1 step && 2 step + 1 step && 1step+2step
	 *  Total to reach 3 steps we can go by 3 ways.. Hence answer is 3
	 */
	
	public static int climbingStairs(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i=3; i<=n; i++) {			
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
		
	}
	
	public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

}
