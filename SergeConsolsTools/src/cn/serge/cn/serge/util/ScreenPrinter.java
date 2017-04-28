package cn.serge.cn.serge.util;

/**
 * Created by sergexu on 2017/4/28.
 */
public class ScreenPrinter implements BasicPrinter {

    private static ScreenPrinter printerInstance;
    private ScreenPrinter() {
    }

    public static ScreenPrinter getInstance() {
        if (printerInstance == null) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (ScreenPrinter.class) {
                //未初始化，则初始instance变量
                if (printerInstance == null) {
                    printerInstance = new ScreenPrinter();
                }
            }
        }
        return printerInstance;
    }

    @Override
    public void println(String info) {
        System.out.println(info);
    }

    @Override
    public void print(String info) {
        System.out.print(info);
    }

    @Override
    public void print(double info) {
        System.out.println(info);
    }

    @Override
    public void print(long info) {
        System.out.println(info);
    }
}
