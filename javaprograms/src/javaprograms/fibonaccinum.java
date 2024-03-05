package javaprograms;

public class fibonaccinum {
  public  static void main(String[] args) {
	  //0 1 1 2 3 5 8 13 21 34
	  int n1=0,n2=1,result,count=11,i;
	  System.out.println(n1+ ""+n2);
	  for(i=2;i<count;i++)
	  {
		  result=n1+n2;
		  System.out.println(result);
		  n1=n2;
		  n2=result;
		  
		  
	  }
	  
  }
}
