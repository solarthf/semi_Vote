package member.model.vo;

import java.sql.Date;

public class VotetestVo {
//	--------- -------- ------------ 
//	V_JUMIN   NOT NULL CHAR(13)     
//	V_NAME             VARCHAR2(20) 
//	M_NO               CHAR(1)      
//	V_TIME             CHAR(4)      
//	V_AREA             CHAR(20)     
//	V_CONFIRM          CHAR(1)  
	
	private String vJumin;
	private String birth;
	private String age;
	private String gender;
	private String vName;
	private String memberNo;
	private String vTime;
	private String vArea;
	private String vConfirm;
	@Override
	public String toString() {
		return "VotetestVo [vJumin=" + vJumin + ", birth=" + birth + ", age=" + age + ", gender=" + gender + ", vName="
				+ vName + ", memberNo=" + memberNo + ", vTime=" + vTime + ", vArea=" + vArea + ", vConfirm=" + vConfirm
				+ "]";
	}
	public String getvJumin() {
		return vJumin;
	}
	public void setvJumin(String vJumin) {
		this.vJumin = vJumin;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getvTime() {
		return vTime;
	}
	public void setvTime(String vTime) {
		this.vTime = vTime;
	}
	public String getvArea() {
		return vArea;
	}
	public void setvArea(String vArea) {
		this.vArea = vArea;
	}
	public String getvConfirm() {
		return vConfirm;
	}
 
	public void setvConfirm(String vConfirm) {
		this.vConfirm = vConfirm;
	}
	
	
}
