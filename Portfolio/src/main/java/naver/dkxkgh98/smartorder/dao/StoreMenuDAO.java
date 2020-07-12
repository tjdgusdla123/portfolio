package naver.dkxkgh98.smartorder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naver.dkxkgh98.smartorder.domain.StoreMenu;

@Repository
public class StoreMenuDAO {
@Autowired
//MyBatis를 xml로 이용할 때 사용하는 클래스
private SqlSession sqlSession;

public List<StoreMenu> allstoremenu(){
	return sqlSession.selectList("StoreMenu.allstoremenu");
	
}

}
