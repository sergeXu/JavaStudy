package cn.serge.cn.serge.domain;

/**
 * Created by sergexu on 2017/4/28.
 */
public class Function {
    private int functionId;
    private String name;
    private String result;
    public int execute(String[] args)
    {
        return 0;
    };

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
