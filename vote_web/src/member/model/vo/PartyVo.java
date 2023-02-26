package member.model.vo;

import java.sql.Date;

public class PartyVo {
//	-------- -------- ------------ 
//	P_CODE   NOT NULL CHAR(2)      
//	P_NAME            VARCHAR2(20) 
//	P_INDATE          DATE         
//	P_READER          VARCHAR2(20) 
//	P_TEL1            CHAR(3)      
//	P_TEL2            CHAR(4)      
//	P_TEL3            CHAR(4)      

	private String pCode;
	private String pName;
	private Date pIndate;
	private String pReader;
	private String pTel1;
	private String pTel2;
	private String pTel3;
	
	@Override
	public String toString() {
		return "PartyVo [pCode=" + pCode + ", pName=" + pName + ", pIndate=" + pIndate + ", pReader=" + pReader
				+ ", pTel1=" + pTel1 + ", pTel2=" + pTel2 + ", pTel3=" + pTel3 + "]";
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
	
	
	
}
