public class Convert {
    public static void main(String[] args) {
        String binary = "101";
        long decimal = 0L;
        long m=1;
        long result = 0;
        //1 0 1 - liczba binarnie
        //0 1 2- index;
        for(int i =0 ; i<binary.length();i++) { //pętla tak długo, jak długi jest string;
            /*
            w pętli najpierw :
            1) (binary.length()-1)-i    długość stringa - 1 i odjąć wartość i z pętli
             */
            int t = Integer.parseInt(String.valueOf(binary.charAt((binary.length()-1)-i)));
            //System.out.println(i);
            decimal += t*m;
            m = (m*2);
            // inne sposób ( w tej samej pętli)
            int reversIndex = binary.length() - i - 1;
            char c= binary.charAt(i);
            result += Character.getNumericValue(c) * Math.pow(2,reversIndex);
        }
        System.out.println(decimal);
        System.out.println("-------------------------");
        System.out.println(result);
    }
}
