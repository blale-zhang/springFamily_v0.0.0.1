package com.catt.spring.mode;

import java.sql.Timestamp;

public class NewsInfo {

	public Long id;
	public String content;
	public String picturePath;
	public Timestamp time;
	public String breadcastPerson;
	public String happenedAddress;
	public int outdateMark;
	public String abstarct;

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

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getBreadcastPerson() {
		return breadcastPerson;
	}

	public void setBreadcastPerson(String breadcastPerson) {
		this.breadcastPerson = breadcastPerson;
	}

	public String getHappenedAddress() {
		return happenedAddress;
	}

	public void setHappenedAddress(String happenedAddress) {
		this.happenedAddress = happenedAddress;
	}

	public int getOutdateMark() {
		return outdateMark;
	}

	public void setOutdateMark(int outdateMark) {
		this.outdateMark = outdateMark;
	}

	public String getAbstarct() {
		return abstarct;
	}

	public void setAbstarct(String abstarct) {
		this.abstarct = abstarct;
	}

}
