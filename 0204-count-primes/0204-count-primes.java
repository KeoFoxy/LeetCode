// class Solution {
//     public int countPrimes(int n) {
//         if (n == 0 || n == 1)
//             return 0;

//         int counter = 0;

//         for (int i = 2; i < n; i++) {
//             if(isPrime(i))
//                 counter++;
//         }

//         return counter;
//     }

//     private static boolean isPrime(int num) {
//         if (num <= 1) return false;
//         if (num == 2) return true;
//         if (num % 2 == 0) return false;
//         for (int i = 3; i <= Math.sqrt(num); i += 2) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }

// Time limit exceed
class Solution {
    
    public int countPrimes(int n) {
        if(n<2){
            return 0 ;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime , true);  
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2 ; i*i<=n ; i++){
            for(int j = 2*i;j<=n;j+=i){
                isPrime[j] = false;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
}