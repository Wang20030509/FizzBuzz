public class Reduce {
    public static void main(String[] args) {
        int n = 100;

        int sum = 0;

        while(n != 0){

            if(n % 2 == 0){

                sum++;
                n = n/2;

            } else {

                sum++;
                n = n - 1;
            }

        }

        System.out.println(sum);

    }
}
