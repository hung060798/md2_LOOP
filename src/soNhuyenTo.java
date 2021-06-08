import java.util.Scanner;
public class soNhuyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int N=2;
        int count = 0;
        while(count < num){
            boolean check = false;
            for (int i =2; i<=N-1; i++){
                if (N % i == 0){
                    check = true;
                    break;
                }
            }
            if(check == false){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
