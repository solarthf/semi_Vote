package member.model.service;

import java.sql.Connection;
import java.util.List;

import static common.jdbc.JdbcTemplate.*;
import member.model.dao.MemberDao;
import member.model.vo.MemberVo;
 

public class MemberService {
 
	public List<MemberVo> getMemberList(){
		List<MemberVo> result = null;
		Connection conn = getConnection();
		result = new MemberDao().getMemberList(conn);
		close(conn);
		return result;
	}
	
	 
 
}
