package cn.edu.guet.common;

public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success(int code, String msg,Object data){

        return new Result(code,msg,data);
    }
    public static Result fail(int code,String msg){

        return new Result(code,msg,null);
    }
    public Result(int code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
