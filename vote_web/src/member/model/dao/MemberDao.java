package member.model.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.vo.MemberVo;
import member.model.vo.PartyVo;

public class MemberDao {
  
	public List<MemberVo> getMemberList(Connection conn) {
		List<MemberVo> result = null;
		String sql = "SELECT M_NO, M_NAME, P_NAME, P_SCHOOL, SUBSTR(M_JUMIN,0,6)||'-'||SUBSTR(M_JUMIN,7) M_JUMIN, M_CITY, P_TEL1, P_TEL2, P_TEL3 "
				+ "FROM TBL_MEMBER_202005 m join TBL_PARTY_202005 p on m.P_CODE = p.P_CODE";
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
				vo.setpName(rs.getString("P_NAME"));
				vo.setSchool(rs.getString("P_SCHOOL"));
				vo.setMemberJumin(rs.getString("M_JUMIN"));
				vo.setMemberCity(rs.getString("M_CITY"));
				vo.setpTel1(rs.getString("P_TEL1"));
				vo.setpTel2(rs.getString("P_TEL2"));
				vo.setpTel3(rs.getString("P_TEL3"));
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
