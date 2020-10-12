import java.util.*; 
import java.lang.*; 
import java.io.*;

public class Solution {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int t= sc.nextInt();
  ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(t); 
  for(int j=0;j<t;j++)
  {
    int n=sc.nextInt();
    ArrayList<Integer> a1 = new ArrayList<Integer>(n);
    for(int i=0;i<n;i++)
    {
      int x =sc.nextInt();
      a1.add(x);
    }
    a.add(a1);
  }
  int k= sc.nextInt();
  while(k>0)
  {
    int o= sc.nextInt();
    int p= sc.nextInt();
    int g = o-1;
    int h= p-1;
    if(g < a.size() && h< a.get(g).size())
    {
      System.out.println(a.get(g).get(h));
    }
    else
    {
      System.out.println("ERROR!");
    }
    k--;
  }
}
}