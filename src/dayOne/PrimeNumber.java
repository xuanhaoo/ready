package dayOne;

/**
 * 求101-200之间有多少个素数，并输出
 * @author liangxuanhao
 * @date 2018年04月20日  14:06
 */
public class PrimeNumber {

    public static void main(String[] args) {

        printPrime();
    }

    /**
     * 素数是指该数只能被1和本身整除的数
     */
    public static void printPrime() {

        for(int i = 101;i <= 200;i++) {
            boolean flag = true; // 每次需要初始化
            for(int j = 2;j < i;j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("该数是一个素数："+i);
            }
        }
    }
}