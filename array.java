public class array {
                    // linear search
                    // public static int linearSearch(int num[] , int key){
                    // for(int i = 0;i<num.length;i++){
                    // if(num[i]==key){
                    // return i;
                    // }
                    // }
                    // return -1;
                    // }

                    // public static void main(String args[]){
                    // int num[]= {10,20,30,40,50,60};
                    // int key=50;
                    // int index= linearSearch(num, key);
                    // if(index==-1){
                    // System.out.println("NOT found");
                    // }else{
                    // System.out.println(" found");
                    // }
                    // }

                    // PRINT LARGEST VALUE
                //     public static int largestNum(int num[]) {
                //                         int largest = Integer.MIN_VALUE;
                //                         int smallest = Integer.MAX_VALUE;
                //                         for (int i = 0; i < num.length; i++) {
                //                                             if (largest < num[i]) {
                //                                                                 largest = num[i];
                //                                             }
                //                                             if (smallest > num[i]) {
                //                                                                 smallest = num[i];
                //                                             }

                //                         }
                //                 System.out.println("smallest number:"+smallest);
                //                return largest;
                //     }

                //     public static void main(String args[]) {
                //                         int num[] = { 10, 34, 56, 63, 2, 41 };
                //                         System.out.println("greatest number;" + largestNum(num));
                                        

                //     }



                // BINARY SEARCH
                // public static void main(String[] args) {
                //     int num[]={10,20,30,40,50,70};
                //     int key=100;
                //     System.out.println(binarySearch(num, key));    
                // }
                // public static int binarySearch(int num[], int key){
                //         int start=0;
                //         int end=num.length-1;
                //         while(start<=end){
                //                 int mid=(start+end)/2;
                //                 if(key==num[mid]){
                //                         return mid;
//                                 }
//                                 if(key<num[mid]){
//                                         end=mid-1;
//                                 }
//                                 else{
//                                         start=mid+1;
//                                 }
//                         }
//                         return-1;
//                 }





        //  REVERSING ARRAY
        
        //         public static void main(String[] args) {
        //         int num[]={1,2,3,4,5,6,7};
        //         reverse(num);
        //         for(int i =0;i<num.length;i++){
        //                 System.out.println(num[i]+" ");
        //         }
        //     System.out.println();    
        // }
        // public static void reverse(int num[]){
        //         int start=0;
        //         int end=num.length-1;
        //         while(start<end){
        //                 int temp=num[start];
        //                 num[start]=num[end];
        //                 num[end]=temp;
        //                 start++;
        //                 end--;
        //         }
        // }
}
