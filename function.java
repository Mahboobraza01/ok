import java.util.*;
public class function {
//                     public static int multiply(int a , int b){
//                                        int product= a*b;
//                                        return product;
//                     }
//          public static void main(String args[]){
//                Scanner sc = new Scanner(System.in);
//                int a= sc.nextInt();
//                int b = sc.nextInt();
//                int prod = multiply(a,b);

//          }   

//             factorial
//        public static int factorial(int n){
//                     int f=1;
//                     for(int i=1;i<=n;i++){
//                                         f=f*i;
//                     }
//                     return f;
//        }
//        public static void main(String[] args) {
//                     int fact=factorial(5);
//                     System.out.println(fact);
//        }

              //  binomial problem

// public static int factorialn(int n){
//                     int f=1;
//                     for(int i=1;i<=n;i++){
//                                         f=f*i;
//                     }
//                     return f;
//        }
// public static int factorialr(int r){
//                     int f=1;
//                     for(int i=1;i<=r;i++){
//                                         f=f*i;
//                     }
//                     return f;
//        }
// public static void main(String[] args) {
//               int nfact = factorialn(6);
//               int rfact =factorialr(4);  
//               int nminusr =factorialn(6-4);
//               int answer = nfact/(rfact*nminusr);
//               System.out.println(answer);

//        }


       // convert DECIMAL to BINARY
       public static void decimalToBin(int decNum){
              int myNdecNum;
              int pow=0;
              int binNum=0;
              while(decNum>0){
                   int rem=decNum%2;
                     binNum=binNum+rem*(int)Math.pow(10, pow);
                     pow++;

              }
              System.out.println(decNum);
       }
       public static void main(String args[]){
             decimalToBin(5);
       }
}

