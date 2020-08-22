package cn.edu.guet.model;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> acf81b3994e9ed39ab420bdae92509ad801dd801
public class Invitation {
    private String inviId;
    private String titleName;
    private String txt;
    private String clickNumber;
    private String replyNumber;
<<<<<<< HEAD
    private List<InvitionReply> invitionReplys=new ArrayList<InvitionReply>();

    public List<InvitionReply> getInvitionReplys() {
        return invitionReplys;
    }

    public void setInvitionReplys(List<InvitionReply> invitionReplys) {
        this.invitionReplys = invitionReplys;
    }

=======
>>>>>>> acf81b3994e9ed39ab420bdae92509ad801dd801

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
