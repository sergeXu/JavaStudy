package cn.serge.cn.serge.domain;

import cn.serge.MainEntry;
import cn.serge.cn.serge.util.ScreenPrinter;

import java.util.Scanner;

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
        printer.println("请输入二进制数字码（单独输入end结束）");
        Scanner scanner = MainEntry.scanner;
        StringBuilder sb = new StringBuilder("");
        String str = "";
        while(scanner.hasNextLine()){
            str = scanner.nextLine();
            if(str.equals("end"))break;
            sb.append(str);
//            printer.println(str+" .. "+sb.toString());
        }
        printer.println("s: "+sb.toString());
        String resultChar =BinaryToChar(sb.toString());
        return 0;
    }
    private String BinaryToChar(String inputBinary)
    {
//        for()
        ScreenPrinter printer = ScreenPrinter.getInstance();
        StringBuilder numString =new StringBuilder();
        StringBuilder numStr = new StringBuilder();
        for(int i=0;i<inputBinary.length()-8;i+=8)
        {
            numStr.delete(0,numStr.length());
            for(int j=0;j<8;j++)
            {
                numStr.append(inputBinary.charAt(i+j));
            }
            printer.println(numStr.toString());
            numString.append(" ");
//            numString.append(Integer.parseInt(numStr.toString(),2));
            char ch = (char)Integer.parseInt(numStr.toString(),2);
            numString.append(ch);
        }
        printer.println("R:"+ numString.toString());
        return "";
    }

}
