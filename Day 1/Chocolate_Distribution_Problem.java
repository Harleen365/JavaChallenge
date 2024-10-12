//Question Link: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long mindiff=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int minval=a.get(i);
            int maxval=a.get(i+m-1);
            mindiff=Math.min(mindiff,maxval-minval);
        }
        return mindiff;
    }
}
