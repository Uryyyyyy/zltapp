package com.zlt.utils;

public enum ResultCode {
    SUCCESS(0,"成功"),
    PARAM_ERROR(-1,"参数不正确"),

    //成功返回的不需要再写结果码，默认时SUCCESS
    //失败结果返回码再后面添加，且注意最后一个需要以分号结尾，其余以逗号结束
    //比如插入失败，删除失败，查询失败等等，以便前端知晓错误原因
    COURSE_INSERT_FAILED(1000,"课程插入失败"),
    COURSE_DELETE_FAILED(1001,"课程删除失败");
    //规定一下范围：任务选择1同学结果码范围为1000-1499，任务2为1501-1999，任务3为2000-2499,任务4为2500-2999
    //前面两个有关课程的是示例，大家可以注释掉，最上面两个是通用的

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Integer code;
    private String msg;
    ResultCode(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
