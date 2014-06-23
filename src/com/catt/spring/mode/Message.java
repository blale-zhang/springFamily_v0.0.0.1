package com.catt.spring.mode;

import java.sql.Timestamp;

public class Message {

	public Long id;
	public String content;
	public Timestamp time;
	public int outDate;
	public Long senderId;
	public Long receiverId;
	public Long pMsgId; // 上一条留言，站内信
	public int sDelMark; // 发送者删除标志
	public int rDelMark; // 接收者删除标志
	public int readMark; // 已读标志

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public int getOutDate() {
		return outDate;
	}

	public void setOutDate(int outDate) {
		this.outDate = outDate;
	}

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}

	public Long getpMsgId() {
		return pMsgId;
	}

	public void setpMsgId(Long pMsgId) {
		this.pMsgId = pMsgId;
	}

	public int getsDelMark() {
		return sDelMark;
	}

	public void setsDelMark(int sDelMark) {
		this.sDelMark = sDelMark;
	}

	public int getrDelMark() {
		return rDelMark;
	}

	public void setrDelMark(int rDelMark) {
		this.rDelMark = rDelMark;
	}

	public int getReadMark() {
		return readMark;
	}

	public void setReadMark(int readMark) {
		this.readMark = readMark;
	}

}
