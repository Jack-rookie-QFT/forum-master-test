package cn.edu.guet.service;

import cn.edu.guet.model.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IInvitationService {
    List<Invitation> getAllInvitationAndReply();
    List<Invitation> getAllInvitationByUserId(String userid);
    //标题模糊查询
    List<Invitation> getInvitationByKeyword(String titlename);
    void deleteInvitationByInviid(String inviid) throws Exception;
    void addInvition(@Param("userid") String userid, @Param("inviid") String inviid,
                     @Param("titlename") String titlename, @Param("txt") String txt) throws Exception;

    void updateInvitationByInviId(@Param("inviid") String inviid,@Param("txt") String txt) throws Exception;
}
