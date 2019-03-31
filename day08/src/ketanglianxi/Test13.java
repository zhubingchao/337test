package ketanglianxi;
//计算-10.8到5.9之间，绝对值大于6或则小于2.1的整数个数。
public class Test13 {
    public static void main(String[] args) {
        int count=0;
        for (int i=(int)-10.8;i<5.9;i++){
            int j=Math.abs(i);
            if(j>6||j<2.1){
                count++;

            }
        }
        System.out.print(count);
    }

}
