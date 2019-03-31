package ketanglianxi;
//分割功能：split
//按逗号(,)分割，如按点（.）分割，需加\\.
public class Test06 {
    public static void main(String[] args) {
      String  s="abc.efg";
    /*  String[] s1=s.split(",");
        System.out.println(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }*/
        String[] s2=s.split("\\.");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }
}
