import java.util.Arrays;

public class Tables {
    public static void main(String[] args) {
        int[] numbers = {5,1,1,4,2,5,4,4,1,2,5,9,3,5,5,5,5,5,5,5,5,5};
        int[] ile = new int[numbers.length];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j=0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                {
                    a++;
                }
            }
            ile[i] = b;
            //powt = 0;


        }

        for(int i = 0; i < numbers.length;i++) {
            d = ile[i];
            if (d >=a)
            {
                a = d;
                c = i;

            }

        }

        System.out.println("Zmienna najczęstsza to  : "+numbers[c]);


    }


}

