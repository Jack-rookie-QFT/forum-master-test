package cn.edu.guet.common;

public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success(Object data){
        return new Result(200,"登录成功",data);
    }
    public static Result fail(){
        return new Result(400,"登录失败",null);
    }
    public Result(int code, String msg, Object data){
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
