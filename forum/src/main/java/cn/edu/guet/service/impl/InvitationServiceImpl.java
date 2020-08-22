package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.InvitationMapper;
import cn.edu.guet.mapper.InvitationReplyMapper;
import cn.edu.guet.model.Invi_Reply;
import cn.edu.guet.model.Invitation;
import cn.edu.guet.service.IInvitationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class InvitationServiceImpl implements IInvitationService {
    @Autowired
    InvitationMapper invitationMapper;
    @Autowired
    InvitationReplyMapper invitationReplyMapper;

    @Override
    public List<Invitation> getAllInvitationAndReply() {
        return invitationMapper.getAllInvitationAndReply();
    }
    @Override
    public List<Invitation> getAllInvitationByUserId(String userid) {
        return invitationMapper.getAllInvitationByUserId(userid);
    }

    @Override
    public List<Invitation> getInvitationByKeyword(String titlename) {
        return invitationMapper.getInvitationByKeyword(titlename);
    }

    @Override
    public void deleteInvitationByInviid(String inviid) throws Exception{
        List<Invi_Reply> invi_replyList=invitationReplyMapper.getReplyIdByInviid(inviid);
        invitationReplyMapper.deleteAllInvi_ReplyReplyByInviid(inviid);
        invitationMapper.deleteInviidAndUserId(inviid);
        invitationMapper.deleteInvitationByInviid(inviid);

        for (int i=0;i<invi_replyList.size();i++){
            invitationReplyMapper.deleteOneIvition_ReplyByReplyid(invi_replyList.get(i).getReplyid());
        }
    }

    @Override
    public void addInvition(@Param("userid") String userid, @Param("inviid") String inviid,
                            @Param("titlename") String titlename, @Param("txt") String txt) throws Exception{
        invitationMapper.addInvitationByInviId(inviid, titlename,txt);
        invitationMapper.addInviidAndUserId(userid,inviid);

    }

    @Override
    public void updateInvitationByInviId(@Param("inviid") String inviid,@Param("txt") String txt) throws Exception{
        invitationMapper.updateInvitationByInviId(inviid,txt);
    }
}
