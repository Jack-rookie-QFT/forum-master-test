package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.service.IInvitationReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("invitationReply")
public class InvitationReplyController {

    @Autowired
    IInvitationReplyService iInvitationReplyService;

    @RequestMapping( value = "addReply",method = RequestMethod.POST)
    @ResponseBody
    public Result addReply(String inviid, String replyuserid, String replyname, String replytxt, String clicknumber){
        try {
            iInvitationReplyService.addReply(inviid,replyuserid,replyname,replytxt,clicknumber);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(404,"回复失败");
        }
        return Result.success(200,"回复成功",inviid);
    }
    @RequestMapping( value = "deleteReply",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteReply(String inviid, String replyid){
        try {
            iInvitationReplyService.deleteOneReply(inviid,replyid);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(404,"删除失败");
        }
        return Result.success(200,"删除成功",inviid);
    }
}
