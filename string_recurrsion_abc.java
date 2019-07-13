public class string_recurrsion_abc {
    public static void main(String[] args) {
        string_recurrsion_abc.recursion("abc","");
    }

    static void recursion(String base, String target) {
        if(target.length() == base.length()) {
            System.out.println(target);
        }
        else{
            for (int i=0; i < base.length(); i++) {
                target = target + base.charAt(i);
                recursion(base,target);
                target = target.substring(0,target.length()-1);
            }
        }
    }

}
