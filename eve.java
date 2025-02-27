import java.util.Scanner;
class od{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i<= end;i++)
        {
         if(i%2!=0)
         {
            sum += i;
         }else{
            continue;
         }
        }
        System.out.println(sum);
    }
}