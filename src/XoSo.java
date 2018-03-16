import java.util.Scanner;

public class XoSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = (int)Math.floor(Math.random()*100);
        int magic=0;
        magic = (result%10)*10+(result/10);
        System.out.println(result+"--"+magic);
        System.out.println("Enter your number GoodLucky :");
        int choice = sc.nextInt();
        if(result==choice){
            System.out.println("You are Winner!!! You will recivered $10,000");
        }else if(choice==magic){
            System.out.println("You are Winner!!! You will recivered  $3,000");
        }else if(choice==result/10 || choice == result%10){
            System.out.println("You are Winner!!! You will recivered  $1,000");
        }
    }
}
