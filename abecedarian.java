public class abecedarian {
        public static boolean isAbecedarian(String s) {
                int index = 0;
                char c = 'a'; 
                while (index < s.length()) {
                        if (c > s.charAt(index)) {
                                return false;
                        }
                        c = s.charAt(index); 
                        index = index + 1;
                        
                }
                return true;
        }

        public static boolean isAbecedarianrec(String s){
                char first = s.charAt(0);
                char second = first ++;
                System.out.println(first);
                System.out.println(second);
                if (s.charAt(0)<second){
                         return isAbecedarianrec(s);
                }
                        
                return false;
        }

        public static void main(String[] args) {
                //System.out.println(isAbecedarian("abcde"));
                System.out.println(isAbecedarianrec("abcde"));
        }
}