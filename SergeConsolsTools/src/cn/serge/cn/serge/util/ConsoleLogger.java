package cn.serge.cn.serge.util;

/**
 * Created by sergexu on 2017/4/28.
 */
public class ConsoleLogger implements BasicLogger{
    @Override
    public void log(String info) {
        System.out.println(System.currentTimeMillis()+"  "+info);
    }
}
