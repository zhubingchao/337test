package ketanglianxi;
//将数组{1,2,3},拼接成“[word1#word2#word3]"
public class Test08 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
       String s= pinJie(arr);
        System.out.println(s);
    }
    public static String pinJie(int[] arr){
        String s="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                s=s+"word"+arr[i]+"]";
            }else{
                s=s+"word"+arr[i]+"#";
            }
        }
        return s;
    }
}
