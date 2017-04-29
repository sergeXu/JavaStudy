package cn.serge.cn.serge.domain;

import cn.serge.MainEntry;
import cn.serge.cn.serge.util.ScreenPrinter;

import java.util.Scanner;

/**
 * Created by sergexu on 2017/4/29.
 */
public class StringToBinaryCode extends Function{

    public static final int STRINGTOBINARYID=9;
    public static final int ALPHALENGTH = 8;

    public StringToBinaryCode() {
        this.setFunctionId(STRINGTOBINARYID);
        this.setName("字符串转换为二进制码");
    }

    @Override
    public int execute(String[] args) {
        ScreenPrinter printer = ScreenPrinter.getInstance();
        printer.println("StringToBinaryCode start");
        printer.println("请输入字符串（单独输入end结束）");
        Scanner scanner = MainEntry.scanner;

        return 0;
    }
    private static String stringToBinary(String text)
    {
        ScreenPrinter printer = ScreenPrinter.getInstance();
        StringBuilder binaryString = new StringBuilder();
        StringBuilder intString = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < text.length(); i++) {
            char tempChar = text.charAt(i);
            intString.append(tempChar);
        }
        printer.println("int数组： "+intString.toString());
        for (int i = 0; i < intString.length(); i++) {
            //
           // binaryString[i*ALPHALENGTH+n] 为二进制数组中的值 对应 intString[i]的值
        }

        return  binaryString.toString();
    }
}
