package cn.edu.guet.mapper;
import cn.edu.guet.model.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationMapper {
    List<Invitation> getAllInvitationAndReply();
    List<Invitation> getAllInvitationByUserId(String userid);
    List<Invitation> getInvitationByKeyword(String titlename);
    void deleteInvitationByInviid(String inviid) throws Exception;
    void deleteInviidAndUserId(String inviid) throws Exception;
    void addInvitationByInviId(@Param("inviid") String inviid, @Param("titlename") String titlename,
                               @Param("txt") String txt) throws Exception;
    void addInviidAndUserId(@Param("userid") String userid,@Param("inviid") String inviid) throws Exception;

    void updateInvitationByInviId(@Param("inviid") String inviid,@Param("txt") String txt) throws Exception;
}
