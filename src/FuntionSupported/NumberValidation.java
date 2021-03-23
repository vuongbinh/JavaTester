package FuntionSupported;


import static java.lang.Math.sqrt;

public class NumberValidation {
    /**
     * Description: Function to check that a number is prime number.
     * param: int x
     * return: boolean
     */
    public boolean isPrimeNumber(int x){
        if (x < 2){
            return false;
        }else {
            for (int i = 2;i <= sqrt(x);++i){
                if (x % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public void checkPrimNumber(boolean result){
        if (!result){
            System.out.println("So nay khong phai so nguyen to");
        }else {
            System.out.println("Day la so nguyen to ne!");
        }
    }
}