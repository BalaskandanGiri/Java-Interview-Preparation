public class recurrsion_string {
    public static void main(String[] args) {
        recurrsion("1??0?101");
    }
    static void recurrsion(String str) {
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '?'){
                str = str.substring(0,i) + '0' + str.substring(i+1);
                recurrsion(str);
                str = str.substring(0,i) + '?' + str.substring(i+1);
            }
            if (str.charAt(i) == '?'){
                str = str.substring(0,i) + '1' + str.substring(i+1);
                recurrsion(str);
                str = str.substring(0,i) + '?' + str.substring(i+1);
            }

            
        }
        if(!str.contains("?"))
        System.out.println(str);
    }
}
