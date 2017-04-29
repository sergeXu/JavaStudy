package cn.serge.cn.serge.domain;

/**
 * Created by sergexu on 2017/4/28.
 */
public abstract class Function {
    private int functionId;
    private String name;
    private String result;
    public abstract int execute(String[] args);


    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
