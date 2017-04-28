package cn.serge;

import cn.serge.cn.serge.domain.ReadingBinaryFunction;
import cn.serge.cn.serge.util.ScreenPrinter;

import java.util.Scanner;

/**
 * Created by sergexu on 2017/4/28.
 */
public class MainEntry {
    public static void main(String[] args) {
        init();
        startMenu();

    }

    public static void init() {

    }

    public static void startMenu() {
        ScreenPrinter printer = ScreenPrinter.getInstance();
        Scanner scanner = new Scanner(System.in);
        printer.println("Welcome to my tools!");
        int chooseInt = 0;
        do {
            printer.println("choose a function:   (选择小于1即退出)");

            chooseInt = scanner.nextInt();
            if(chooseInt<1)
            {
                System.exit(0);
            }
            printer.println("Function  " + chooseInt + " start:");
            //执行功能
            loadFunction(chooseInt);
            printer.println("Function  " + chooseInt + " end:");
        }

        while (chooseInt != 0);
        //

    }

    public static void loadFunction(int chooseNum) {
        ScreenPrinter printer = ScreenPrinter.getInstance();
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
    }
}
