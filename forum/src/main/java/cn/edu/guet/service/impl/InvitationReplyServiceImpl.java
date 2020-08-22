package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.InvitationReplyMapper;
import cn.edu.guet.service.IInvitationReplyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

public class InvitationReplyServiceImpl implements IInvitationReplyService {
    @Autowired
    InvitationReplyMapper invitationReplyMapper;

    @Override
    public void addReply(@Param("inviid") String inviid,@Param("replyuserid") String replyuserid,
                         @Param("replyname") String replyname, @Param("replytxt") String replytxt,
                         @Param("replyclicknumber") String clicknumber) throws Exception {
        String currentReplyId= UUID.randomUUID().toString().replace("-","");
        invitationReplyMapper.insertInvitationReplyByReplyId(replyuserid,replyname,replytxt,clicknumber,currentReplyId);
        invitationReplyMapper.insertInviidAndReplyid(inviid,currentReplyId);
        int replyNumber=Integer.parseInt(invitationReplyMapper.getCurrentReplyNumber(inviid));
        replyNumber=replyNumber+1;
        invitationReplyMapper.addReplyNumber(inviid,Integer.toString(replyNumber));
    }

    @Override
    public void deleteOneReply(String inviid,String replyid) throws Exception {
        invitationReplyMapper.deleteOneInvi_ReplyByReplyid(replyid);
        invitationReplyMapper.deleteOneIvition_ReplyByReplyid(replyid);
        int replyNumber=Integer.parseInt(invitationReplyMapper.getCurrentReplyNumber(inviid));
        replyNumber=replyNumber-1;
        invitationReplyMapper.addReplyNumber(inviid,Integer.toString(replyNumber));
    }
}
