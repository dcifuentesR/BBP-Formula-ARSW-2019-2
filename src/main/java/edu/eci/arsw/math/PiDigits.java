package edu.eci.arsw.math;

///  <summary>
///  An implementation of the Bailey-Borwein-Plouffe formula for calculating hexadecimal
///  digits of pi.
///  https://en.wikipedia.org/wiki/Bailey%E2%80%93Borwein%E2%80%93Plouffe_formula
///  *** Translated from C# code: https://github.com/mmoroney/DigitsOfPi ***
///  </summary>
public class PiDigits {
    private static int DigitsPerSum = 8;



    /**
     * Returns a range of hexadecimal digits of pi.
     * @param start The starting location of the range.
     * @param count The number of digits to return
     * @return An array containing the hexadecimal digits.
     */
    public static byte[] getDigits(int start, int count, int N) throws InterruptedException {
        if (start < 0) {
            throw new RuntimeException("Invalid Interval");
        }

        if (count < 0) {
            throw new RuntimeException("Invalid Interval");
        }

        byte[] digits = new byte[count];
        piThread[] threads = new piThread[N];
        int range = count/N;
        for(int i = 0; i < N; i++){
//            
//            if((i+1)*(count/N) <= count){
                
                threads[i] = new piThread(start,i * range, range, digits);   

//            }
//                
//                
//            else{
//                     threads[i] = new piThread(start + i * range,i * range, count - range * i, digits);   
//                    }
            threads[i].start();
        }
        
        for(int i = 0; i < N; i++){
            threads[i].join();
        }
        
        
        
        
//        double sum = 0;
//
//        for (int i = 0; i < count; i++) {
//            if (i % DigitsPerSum == 0) {
//                sum = 4 * sum(1, start)
//                        - 2 * sum(4, start)
//                        - sum(5, start)
//                        - sum(6, start);
//
//                start += DigitsPerSum;
//            }
//
//            sum = 16 * (sum - Math.floor(sum));
//            digits[i] = (byte) sum;
//        }

        return digits;
    }

    /// <summary>
    /// Returns the sum of 16^(n - k)/(8 * k + m) from 0 to k.
    /// </summary>
    /// <param name="m"></param>
    /// <param name="n"></param>
    /// <returns></returns>
    

}
