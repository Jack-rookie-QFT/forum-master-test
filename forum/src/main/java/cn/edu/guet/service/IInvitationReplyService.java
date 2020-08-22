package cn.edu.guet.service;

import cn.edu.guet.model.Invi_Reply;
import cn.edu.guet.model.InvitionReply;
import org.apache.ibatis.annotations.Param;

public interface IInvitationReplyService {
    void addReply(@Param("inviid") String inviid,@Param("replyuserid") String replyuserid,
                  @Param("replyname") String replyname,@Param("replytxt") String replytxt,
                  @Param("replyclicknumber") String clicknumber) throws Exception;
    void deleteOneReply(@Param("inviid") String inviid,@Param("replyid") String replyid) throws Exception;
}
