
/*WAJP to reverse a string*/
package part3java;

public class StringEx2 {
public static void main(String[] args) {
	String s="Hello";
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
}
