package naver.dkxkgh98.storemember.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naver.dkxkgh98.storemember.domain.StoreMember;

@Repository
public class StoreMemberDAO {
@Autowired
//MyBatis 를 xml로 이용할 때 사용하는 클래스
private SqlSession sqlSession;

public List<StoreMember>allstoremember(){
	return sqlSession.selectList("storemember.allstoremember");
	
}
}
