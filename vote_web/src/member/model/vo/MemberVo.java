package member.model.vo;

import java.sql.Date;

public class MemberVo {
//	-------- -------- ------------ 
//	M_NO     NOT NULL CHAR(1)      
//	M_NAME            VARCHAR2(20) 
//	P_CODE            CHAR(2)      
//	P_SCHOOL          CHAR(1)      
//	M_JUMIN           CHAR(13)     
//	M_CITY            VARCHAR2(20)
	
	private int memCnt;
	private String memberNo;
	private String memberName;
	private String partyCode;
	private String school;
	private String memberJumin;
	private String memberCity;
	private String pCode;
	private String pName;
	private Date pIndate;
	private String pReader;
	private String pTel1;
	private String pTel2;
	private String pTel3;
	
	 

	public int getMemCnt() {
		return memCnt;
	}

	public void setMemCnt(int memCnt) {
		this.memCnt = memCnt;
	}

	@Override
	public String toString() {
		return "MemberVo [memCnt=" + memCnt + ", memberNo=" + memberNo + ", memberName=" + memberName + ", partyCode="
				+ partyCode + ", school=" + school + ", memberJumin=" + memberJumin + ", memberCity=" + memberCity
				+ ", pCode=" + pCode + ", pName=" + pName + ", pIndate=" + pIndate + ", pReader=" + pReader + ", pTel1="
				+ pTel1 + ", pTel2=" + pTel2 + ", pTel3=" + pTel3 + "]";
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getpIndate() {
		return pIndate;
	}

	public void setpIndate(Date pIndate) {
		this.pIndate = pIndate;
	}

	public String getpReader() {
		return pReader;
	}

	public void setpReader(String pReader) {
		this.pReader = pReader;
	}

	public String getpTel1() {
		return pTel1;
	}

	public void setpTel1(String pTel1) {
		this.pTel1 = pTel1;
	}

	public String getpTel2() {
		return pTel2;
	}

	public void setpTel2(String pTel2) {
		this.pTel2 = pTel2;
	}

	public String getpTel3() {
		return pTel3;
	}

	public void setpTel3(String pTel3) {
		this.pTel3 = pTel3;
	}
	
	public MemberVo() {
		super();
	}
	 
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPartyCode() {
		return partyCode;
	}
	public void setPartyCode(String partyCode) {
		this.partyCode = partyCode;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		switch (school) {
		case "1":
			school = "고졸";
			break;
		case "2":
			school = "학사";
			break;
		case "3":
			school = "석사";
			break;
		case "4":
			school = "박사";
			break;	
		}
		this.school = school;
	}
	public String getMemberJumin() {
		return memberJumin;
	}
	public void setMemberJumin(String memberJumin) {
		this.memberJumin = memberJumin;
	}
	public String getMemberCity() {
		return memberCity;
	}
	public void setMemberCity(String memberCity) {
		this.memberCity = memberCity;
	}
	
	 
	
}
