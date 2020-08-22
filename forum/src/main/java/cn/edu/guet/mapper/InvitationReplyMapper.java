package cn.edu.guet.mapper;

import cn.edu.guet.model.Invi_Reply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationReplyMapper {
    void insertInvitationReplyByReplyId(@Param("replyuserid") String replyuserid,@Param("replyname") String replyname,
                                        @Param("replytxt") String replytxt,@Param("clicknumber") String clicknumber,
                                        @Param("replyid") String replyid) throws Exception;
    void insertInviidAndReplyid(@Param("inviid") String inviid,@Param("replyid") String replyid) throws Exception;
    void addReplyNumber(@Param("inviid") String inviid,@Param("replynumber") String replynumber);
    String getCurrentReplyNumber(@Param("inviid") String inviid)throws Exception;
    void deleteOneInvi_ReplyByReplyid(@Param("replyid") String replyid) throws Exception;
    void deleteOneIvition_ReplyByReplyid(@Param("replyid") String replyid) throws Exception;
    void deleteAllInvi_ReplyReplyByInviid(@Param("inviid") String inviid) throws Exception;
    List<Invi_Reply> getReplyIdByInviid(@Param("inviid") String inviid) throws Exception;
}
