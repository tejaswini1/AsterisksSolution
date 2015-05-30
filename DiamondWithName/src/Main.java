import java.io.*;
class Main
{

    public static int input()throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number");
        return Integer.parseInt(bufferedReader.readLine());
    }
    public static void pattern(int no)
    {
        int step=1;int flag=0;
        for(int rowIterator=0;rowIterator>-1;rowIterator+=step)
        {


            for(int columnIterator=0;columnIterator<(no+(no-1));columnIterator++)
            {
                if(columnIterator+rowIterator>=((no+(no-1))/2)&&columnIterator-rowIterator<=((no+(no-1))/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(rowIterator==no&&flag==0){
                System.out.println("tejaswini");
                flag=1;
                rowIterator=rowIterator-1;
            }
            System.out.println();
            if(rowIterator==no-1)
                step=-1;
        }

    }
    public static void main(String[] args) throws Exception
    {
        Main.pattern(Main.input());
    }
}
