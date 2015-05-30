import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int input() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number");
        return Integer.parseInt(bufferedReader.readLine());
    }

    public static void main(String[] args) throws IOException{
        int count=Main.input();
        for(int rowIterator=0;rowIterator<count;rowIterator++)
        {
            for(int columnIterator=0;columnIterator<(count+(count-1));columnIterator++)
            {
                if(columnIterator+rowIterator>=((count+(count-1))/2)&&columnIterator-rowIterator<=((count+(count-1))/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
