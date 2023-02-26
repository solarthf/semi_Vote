package member.model.service;

import java.sql.Connection;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.dao.RankDao;
import member.model.vo.MemberVo;
  
public class RankService {

	public List<MemberVo> getRankList() {
		List<MemberVo> result = null;
		Connection conn = JdbcTemplate.getConnection();
		result = new RankDao().getRankList(conn);
		JdbcTemplate.close(conn);
		return result;
	}

}
