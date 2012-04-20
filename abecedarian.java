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
                return isAbecedarianrechelp(s,(char)0);
        }
        
        public static boolean isAbecedarianrechelp(String s,char c){
                if(s.isEmpty()){
                        return true;
                }else if (c>s.charAt(0)){
                         return false;
                }else{
                        return isAbecedarianrechelp(s.substring(1),s.charAt(0));
                }
        }

        public static void main(String[] args) {
                System.out.println(isAbecedarian("abcde"));
                System.out.println(isAbecedarianrec("abcde"));
        }
}