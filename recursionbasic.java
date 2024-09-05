public class recursionbasic {

                    // print number in increasing order
//     public static void printInc(int n){
//                     if(n==100){
//                                         System.out.println(100);
//                                         return;
//                     }
//                     System.out.println(n);
//                     printInc(n+1);
//     }   
//     public static void main(String[] args) {
//                     int n = 1;
//                     printInc(n);
//     } 


           // find sum of n natural number
//            public static int calcSum(int n){
//                     if(n==1){
//                                         return 1;
//                     }
//                     int sumnm= calcSum(n-1);
//                     int sum = n + sumnm;
//                     return sum;
                    
//            }
//            public static void main(String[] args) {
//                     int n = 10;
//                     int p = calcSum(n);
//                     System.out.println(p);
                    
//            }


                    // print nth fabinno series
                  //   public static int fabin(int n){
                  //      if(n==0 || n==1){
                  //                       return n;
                  //      }
                  //      int fnm2= fabin(n-2);
                  //      int fnm1 = fabin(n-1);
                  //      int fabin = fnm1 + fnm2;
                  //      return fabin;

                  //   }
                  //   public static void main(String[] args) {
                  //                       int n = 5;
                  //                       int f = fabin(n);
                  //                       System.out.println(f);
                                        
                  //   }


                  // Print x to power n
//                   public static int calcPow(int x,int n){
//                       if(n==0){
//                         return 1;
//                       }
//                       int xpownm1 = calcPow( x , n-1);
//                       int powr = x * xpownm1;
//                       return powr;
//                   }
//                   public static void main(String[] args) {
//                      int x = 2;
//                      int n = 0;
//                      System.out.println(calcPow(x,n));
//                   }


              //  TILING PROBLEM
              public static int tilingProblem(int n){
                  if (n==0 || n==1){
                    return 1;
                  }
                  int vertical = tilingProblem(n-1);
                  int horizontal = tilingProblem(n-2);
                  int totalWays= vertical+horizontal;
                  return totalWays;
              }
              public static void main(String[] args) {
                System.out.println(tilingProblem(5));
              }
 }
