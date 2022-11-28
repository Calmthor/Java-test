import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class KFCCrazyThusdayException extends Exception {
    KFCCrazyThusdayException() {
        System.out.println("你产生了想吃炸鸡的错误想法");
    }
}

class level1 {
    public static void main(String[] args) throws KFCCrazyThusdayException {
        File f = new File("D:\\不学JAVA了.txt");

        try {
            if (f.exists()) ;
            else {
                f.createNewFile();
            }
            FileWriter wg = new FileWriter(f);
            String a = new String();
            int i = 0;
            while (f.length()<=1024*1024) {
                a += i;
                i++;
                wg.write(a);
            } wg.close();
            KFCCrazyThusdayException KFC = new KFCCrazyThusdayException();
            throw KFC;
        } catch (KFCCrazyThusdayException | IOException KFC) {
            System.out.println("所以程序崩溃了，并一直产生垃圾文件");
            for (; ; ) {
                System.out.println("不要卷（在D盘产生了一个叫“不学Java了”的垃圾文件），学长记得自己删一下（应该有1兆字节），嘿嘿");
            }
        }
    }
}