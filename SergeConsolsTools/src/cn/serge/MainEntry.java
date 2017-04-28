package cn.serge;

import cn.serge.cn.serge.domain.ReadingBinaryFunction;
import cn.serge.cn.serge.util.BasicPrinter;
import cn.serge.cn.serge.util.ScreenPrinter;

import java.util.Scanner;

/**
 * Created by sergexu on 2017/4/28.
 */
public class MainEntry {
    private static BasicPrinter printer;
    public static Scanner scanner;
    public static void main(String[] args) {
        init();
        startMenu();

    }

    public static void init() {
        printer = ScreenPrinter.getInstance();
        scanner = new Scanner(System.in);
    }

    public static void startMenu() {
        printer.println("Welcome to my tools!");
        int chooseInt = 0;
        do {
            showMenu();
            chooseInt = scanner.nextInt();
            if(chooseInt<1)
            {
                System.exit(0);
            }
            printer.println("Function  " + chooseInt + " start:");
            //执行功能
            loadFunction(chooseInt);
            printer.println("Function  " + chooseInt + " end\n");
        }

        while (chooseInt != 0);
        //

    }

    public static void loadFunction(int chooseNum) {
        printer.println("-----------------------------------------");
        switch (chooseNum) {
            case ReadingBinaryFunction.BINARYFUNCTIONID:
                ReadingBinaryFunction function = new ReadingBinaryFunction();
                function.execute(null);
                break;
            case 0:
                break;

            default:
                printer.println("未找到相应的功能");
        }
        printer.println("-----------------------------------------");
    }
    public static void showMenu()
    {
        StringBuilder str = new StringBuilder("");
        str.append("10 二进制文件转换为10进制以及字符串\n");
        printer.print(str.toString());
        printer.println("choose a function:   (选择小于1即退出)");
    }
}
