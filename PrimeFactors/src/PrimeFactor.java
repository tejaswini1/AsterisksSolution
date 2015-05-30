import java.util.ArrayList;

public class PrimeFactor {
    private static ArrayList<Integer> primeFactors=new ArrayList<Integer>();
    public static void generate(int number){
            if(number==1)
                return;
        int count=2;
                while(number>1){
                if(number%count==0)
                {
                    if(isPrime(count)){
                        if(!isAlredyPresent(count))
                            primeFactors.add(count);
                    number/=count;}
                }
                else
                    count++;
            }
    }


    public static boolean isPrime(int number){
        for(int count=2;count<number;count++) {
            if (number % count == 0)
                return false;
        }
        return true;
    }

    public static boolean isAlredyPresent(int number){
       return primeFactors.contains(number);
    }

    public static void  display(){
        for(int num:primeFactors)
            System.out.println(" "+num);
    }
}
