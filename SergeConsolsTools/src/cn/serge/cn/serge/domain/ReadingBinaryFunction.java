package cn.serge.cn.serge.domain;

import cn.serge.cn.serge.util.ScreenPrinter;

/**
 * Created by sergexu on 2017/4/28.
 */
public class ReadingBinaryFunction extends Function{
    public static final int BINARYFUNCTIONID=10;
    public ReadingBinaryFunction() {
        this.setFunctionId(10);
        this.setName("读取二进制文件为字符串");
    }

    @Override
    public int execute(String[] args) {
        ScreenPrinter printer = ScreenPrinter.getInstance();
        printer.println("ReadingBinaryFunction start");
        return 0;
    }
}
