package demo;

import java.util.StringTokenizer;
public class StringTokenize {
	public static void main(String[] args) {
		String s="Java-is-a-programming-language";
		StringTokenizer st=new StringTokenizer(s,"-");
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());
		}
	}
}
