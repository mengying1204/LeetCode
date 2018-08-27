package Java_Study;

/**
 * 输入一个整数，求该整数的二进制表达中有多少个1。
 * 例如，输入10，由于其二进制表示为1010，有两个1，因此输出2。
 * 两种方法：
 *      1.先将整数num转换为二进制后，在遍历
 *      2.直接使用位运算
 */
public class NumberOf1 {
    public static void main(String[] args) {
        //测试
        System.out.println("方法一："+getCountOne(1801));
        System.out.println("方法一："+getCountOne(-1801));
        System.out.println("******************************");
        System.out.println("方法二："+getCountOne2(1801));
        System.out.println("方法二："+getCountOne2(-1801));
    }
    //方法一：进制转换后，for循环
    public static int getCountOne(int num){
        //1.转换为二进制
        String binary=Integer.toBinaryString(num);
        System.out.println(num+" 转化为二进制："+binary);
        int count=0;//计数器
        for(int i=0;i<binary.length();i++){
            char x=binary.charAt(i);
            if(x=='1'){
                count++;
            }
        }
        return count;
    }

    //方法二：位运算
    public static int getCountOne2(int num){
        int count=0;
        while(num!=0) {
            if((num&1)==1) {
                count++;
            }
            //注意：必须使用无符号位右移(>>>)--区别于：右移(>>)，采用右移时，负数会陷入死循环(-1>>-1,结果为-1)
            num = num>>>1;
        }
        return count;
    }

}

