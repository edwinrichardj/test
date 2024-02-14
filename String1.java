/*Input: a1b2c3
Output: abbccc
Caution: Don't use inbuilt functions */
import java.util.*;
public class String1{
  public static void main(String args[]){
    Scanner sc=new.Scanner(System.in);
    String str=sc.next();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        int num=str.charAt(i)-'0';
        for(int j=0;j<num;j++){
          System.out.print(str.charAt(i-1));
        }
      }
      else{
      System.out.print(str.charAt(i));
      }
    }
  }
}
