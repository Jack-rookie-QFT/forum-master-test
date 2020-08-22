package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Invitation;
import cn.edu.guet.service.IInvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("invitation")
public class InvitationController {

    @Autowired
    IInvitationService invitationService;

    @RequestMapping( value = "getAllInvitationAndReply",method = RequestMethod.POST)
    @ResponseBody
    public List<Invitation> getAllInvitationAndReply(){
        return invitationService.getAllInvitationAndReply();
    }
    @RequestMapping(value = "getAllInvitationByUserId",method = RequestMethod.POST)
    @ResponseBody
    public List<Invitation> getAllInvitationByUserId(String userid){
        return invitationService.getAllInvitationByUserId(userid);
    }

    @RequestMapping(value = "getInvitationNunberByUserId",method = RequestMethod.POST)
    @ResponseBody
    public int getInvitationNunberByUserId(String userid){
        return invitationService.getAllInvitationByUserId(userid).size();
    }

    @RequestMapping(value = "getInvitationByKeyword",method = RequestMethod.POST)
    @ResponseBody
    public List<Invitation> getInvitationByKeyword(String titlename){
        return invitationService.getInvitationByKeyword(titlename);
    }

    @RequestMapping(value = "addInvition",method = RequestMethod.POST)
    @ResponseBody
    public Result addInvitiond(String userid, String inviid, String titlename, String txt){
        try {
            invitationService.addInvition(userid,inviid,titlename,txt);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(404,"创建帖子失败");
        }
        return Result.success(200,"创建帖子成功",userid);
    }

    @RequestMapping(value = "deleteInvitationByInviid",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteInvitationByInviid(String inviid){
        try {
            invitationService.deleteInvitationByInviid(inviid);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(404,"删除帖子失败");
        }
        return Result.success(200,"删除帖子成功",inviid);
    }

    @RequestMapping(value = "updateInvitationByInviId",method = RequestMethod.POST)
    @ResponseBody
    public Result updateInvitationByInviId(String inviid,String txt){
        try {
            invitationService.updateInvitationByInviId(inviid,txt);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(404,"修改帖子失败");
        }
        return Result.success(200,"修改帖子成功",inviid);
    }
}
