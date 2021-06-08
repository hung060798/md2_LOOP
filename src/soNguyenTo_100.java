
public class soNguyenTo_100 {
    public static void main(String[] args) {
            int N=2;
            while(N < 100){
                boolean check = false;
                for (int i =2; i<=Math.sqrt(N); i++){
                    if (N % i == 0){
                        check = true;
                        break;
                    }
                }
                if(check == false)
                    System.out.println(N);
                N++;
            }

    }
}


