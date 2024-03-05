package javaprograms;

public class reversewordsinstring {
	public static void main(String[] args) {
	 
		String str="Welcome To Java";
		String words[]=str.split(" ");
		String resultString="";
		for(String w:words) {
			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--) {//emoclew
				reverseWord=reverseWord+w.charAt(i);
			}
			resultString=resultString+reverseWord+" ";
			
		}
		System.out.println("reversed String ="+resultString);
	}
}
