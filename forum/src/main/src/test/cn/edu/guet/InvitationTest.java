package cn.edu.guet;

import cn.edu.guet.mapper.InvitationMapper;
import cn.edu.guet.model.Invitation;
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

public class InvitationTest extends TestCase {

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
    public void testgetAllInvitation(){
        InvitationMapper invitationMapper=sqlSession.getMapper(InvitationMapper.class);
        List<Invitation> invitationList=invitationMapper.getAllInvitationAndReply();
        System.out.println(JSON.toJSON(invitationList));
        System.out.println(invitationList.size());
    }

	@After
	public void tearDown(){
		sqlSession.close();
	}
}