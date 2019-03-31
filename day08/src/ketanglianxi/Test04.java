package ketanglianxi;
/*//length():长度
//count(" "):字符串拼接，产生一个新的字符串。
//charAt(int x):获取指定索引处的字符
//*/
public class Test04 {
    public static void main(String[] args) {
        String s1="abcdefgdey";
        //算字符串长度
        System.out.println(s1.length());
        //字符串拼接
        String result=s1.concat("ABC");
        System.out.println(result);
        //charAt(int x):获取指定索引处的字符
        char s2=s1.charAt(3);
        System.out.println(s2);
        System.out.println("------");
        //遍历字符串中的字符
        for(int i=0;i<=s1.length()-1;i++)
        System.out.println(s1.charAt(i));
       int s3=s1.indexOf("c");
        System.out.println(s3);
        System.out.println("-----");
        String substring = s1.substring(3);
        System.out.println(substring);

        System.out.println("-----");
        String substring1 = s1.substring(2, s1.length());
        System.out.println(substring1);

    }

}
