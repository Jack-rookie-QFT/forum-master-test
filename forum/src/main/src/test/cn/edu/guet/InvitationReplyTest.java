package cn.edu.guet;

import cn.edu.guet.mapper.InvitationMapper;
import cn.edu.guet.mapper.InvitationReplyMapper;
import cn.edu.guet.model.Invi_Reply;
import cn.edu.guet.model.InvitionReply;
import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class InvitationReplyTest extends TestCase {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void setUp(){
        // Mybatis 配置文件
        String resource = "mybatis-config.xml";

        // 得到配置文件流
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建会话工厂，传入 MyBatis 的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();

    }
    @Test
    public void testinsertInvitationReply() {
        System.out.println("ssss");
        InvitationMapper invitationMapper = sqlSession.getMapper(InvitationMapper.class);
        InvitationReplyMapper invitationReplyMapper = sqlSession.getMapper(InvitationReplyMapper.class);
        InvitionReply invitionReply = new InvitionReply();
        Invi_Reply invi_reply = new Invi_Reply();
        invitionReply.setReplyid("00004");
        invitionReply.setReplyname("syk");
        invitionReply.setReplytxt("sdawdada");
        invitionReply.setClicknumber("2");
        invitionReply.setReplyuserid("00001");
        invi_reply.setInviid("T0004");
        invi_reply.setReplyid("00004");

        sqlSession.commit();
    }
    @Test
    public void testgetAllReplyIdByInviId(){
        InvitationReplyMapper invitationReplyMapper = sqlSession.getMapper(InvitationReplyMapper.class);
        List<Invi_Reply> invi_replies= null;
        try {
            invi_replies = invitationReplyMapper.getReplyIdByInviid("T0004");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSON(invi_replies));

    }
    @After
    public void tearDown(){
        sqlSession.close();
    }
}