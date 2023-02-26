package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.jdbc.JdbcTemplate;
import member.model.vo.VotetestVo;

public class VotetestDao {

	public List<VotetestVo> getVoteList(Connection conn) {
		List<VotetestVo> result = null;
		
		String sql = "SELECT V_NAME"
				+ ", to_char(to_date(('19'||SUBSTR(V_JUMIN, 0, 6))), 'yyyy\"년\"mm\"월\"dd\"일생\"') birth"
				+ ", '만 '||(EXTRACT(YEAR FROM SYSDATE) - ('19'||SUBSTR(V_JUMIN, 0, 2)))||'세' age"
				+ ", DECODE(SUBSTR(V_JUMIN, 7,1), '1', '남', '2', '여') gender"
				+ ", M_NO, SUBSTR(V_TIME,0,2)||':'||SUBSTR(V_TIME,3) V_TIME"
				+ ", DECODE(V_CONFIRM, 'Y', '확인', 'N', '미확인') V_CONFIRM"
				+ " FROM TBL_VOTE_202005 WHERE V_AREA = '제1투표장'";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			result = new ArrayList<VotetestVo>();
			while(rs.next()) {
				VotetestVo vo = new VotetestVo();
				vo.setvName(rs.getString("V_NAME"));
				vo.setBirth(rs.getString("birth"));
				vo.setAge(rs.getString("age"));
				vo.setGender(rs.getString("gender"));
				vo.setMemberNo(rs.getString("M_NO"));
				vo.setvTime(rs.getString("V_TIME"));
				vo.setvConfirm(rs.getString("V_CONFIRM"));
				result.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		System.out.println(result);
		return result;
		}

	public int vote(Connection conn, VotetestVo vo) {
		int result = -1;
		
		String sql = "INSERT INTO TBL_VOTE_202005 VALUES"
				+ "(?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getvJumin());
			pstmt.setString(2, vo.getvName());
			pstmt.setString(3, vo.getMemberNo());
			pstmt.setString(4, vo.getvTime());
			pstmt.setString(5, vo.getvArea());
			pstmt.setString(6, vo.getvConfirm());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
				
		return result;
	}
	}
		

