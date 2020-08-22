package cn.edu.guet.model;

import java.util.ArrayList;
import java.util.List;

public class Invitation {
    private String inviId;
    private String titleName;
    private String txt;
    private String clickNumber;
    private String replyNumber;
    private List<InvitionReply> invitionReplys=new ArrayList<InvitionReply>();

    public List<InvitionReply> getInvitionReplys() {
        return invitionReplys;
    }

    public void setInvitionReplys(List<InvitionReply> invitionReplys) {
        this.invitionReplys = invitionReplys;
    }


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
