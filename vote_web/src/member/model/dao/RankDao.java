package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.vo.MemberVo;
 

public class RankDao {

	public List<MemberVo> getRankList(Connection conn) {
		List<MemberVo> result = null;
		
		String sql = "SELECT V.M_NO M_NO, M.M_NAME M_NAME, COUNT(*) cnt"
				+ " FROM TBL_VOTE_202005 V"
				+ " JOIN TBL_MEMBER_202005 M"
				+ "   ON M.M_NO = V.M_NO"
				+ " GROUP BY V.M_NO, M.M_NAME"
				+ " ORDER BY COUNT(*) DESC";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			result = new ArrayList<MemberVo>();
			while(rs.next()) {
				MemberVo vo = new MemberVo();
				vo.setMemberNo(rs.getString("M_NO"));
				vo.setMemberName(rs.getString("M_NAME"));
				vo.setMemCnt(rs.getInt("cnt"));
				result.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return result;
	}

}
