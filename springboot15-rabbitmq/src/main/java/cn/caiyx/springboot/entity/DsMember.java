package cn.caiyx.springboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-12-09 
 */
public class DsMember implements Serializable {

	private static final long serialVersionUID =  1803781296506174701L;
	private Integer memberId;
	private String fullName;
	private Integer inviterId;
	private Date createDate;
	private BigDecimal amount;

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getInviterId() {
		return inviterId;
	}

	public void setInviterId(Integer inviterId) {
		this.inviterId = inviterId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
