import java.util.*;
public class string {
//        public static boolean isPalindrome(String str){
//                     for(int i=0;i<str.length()/2;i++){
//                                         int n = str.length();
//                     if(str.charAt(i)!=str.charAt(n-1-i)){
//                                         return false;
//                     }
//        }             
// return true;
// }
// public static void main(String args[]){
//                     String str= "raza";
//                     System.out.println(isPalindrome(str));
// }


       //  COUNT VOWELS
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              String str = sc.next();
              int count=0;
              for(int i=0;i<str.length();i++){
                     char ch = str.charAt(i);
                     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                            count++;
                     }
              }
              System.out.println(count);

       }
}    
