package cn.edu.guet.model;

public class Invitation {
    private String inviId;
    private String titleName;
    private String txt;
    private String clickNumber;
    private String replyNumber;

    public String getInviId() {
        return inviId;
    }

    public void setInviId(String inviId) {
        this.inviId = inviId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getClickNumber() {
        return clickNumber;
    }

    public void setClickNumber(String clickNumber) {
        this.clickNumber = clickNumber;
    }

    public String getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }
}
