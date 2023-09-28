public class stringmethods {
    public static void main(String[] args){
         String name="Harry";
         int value = name.length();
         System.out.println(value);
         String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String ntstring="  Harry  ";
        System.out.println(ntstring);
        System.out.println(ntstring.trim());

    }
}
