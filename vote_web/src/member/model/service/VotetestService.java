package member.model.service;


import java.sql.Connection;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.dao.VotetestDao;
import member.model.vo.VotetestVo;

public class VotetestService {

	public List<VotetestVo> getVoteList() {
		List<VotetestVo> result = null;
		Connection conn = JdbcTemplate.getConnection();
		result = new VotetestDao().getVoteList(conn);
		JdbcTemplate.close(conn);
		return result;
	}

	public int vote(VotetestVo vo) {
		int result = -1;
		Connection conn = JdbcTemplate.getConnection();
		result = new VotetestDao().vote(conn, vo);
		JdbcTemplate.close(conn);
		return result;
	}

}
