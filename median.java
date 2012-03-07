class median{
      public static int bigger(int a,int b){
            if (a > b){
                  return a;
            }else{
                  return b;

    }

}

public static int biggest(int a,int b,int c){
      return bigger(a,bigger(b,c));
}

public static int median1(int a, int b, int c){

            int lastItem = biggest(a,b,c);

            int result1 = 0;

            int result2 = 0;

            if (a == lastItem){

                        result1 = b;

                        result2 = c;

            }

            if (b == lastItem){

                        result1 = a;

                        result2 = c;

            }

            if (c == lastItem){

                        result1 = a;

                        result2 = b;

            }

            int med = bigger(result1,result2);

            return med;
}

public static void main(String[] args) {
      int result;
      result = median1(3,7,5);
      System.out.println(result);
      }
}

                       

