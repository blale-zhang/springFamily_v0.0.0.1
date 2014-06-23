package com.catt.spring.mode;

import java.sql.Timestamp;

public class Resource {

	public String fileName;

	public String filePic;

	public Long property;// 文件大小 （字节）

	public String fileType; //后缀名 ,doc表示word文档

	public Long fileOwner;

	public Timestamp createTime;

	public int shareable; // 分享标志 1为可分享，0为不分享

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePic() {
		return filePic;
	}

	public void setFilePic(String filePic) {
		this.filePic = filePic;
	}

	public Long getProperty() {
		return property;
	}

	public void setProperty(Long property) {
		this.property = property;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Long getFileOwner() {
		return fileOwner;
	}

	public void setFileOwner(Long fileOwner) {
		this.fileOwner = fileOwner;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public int getShareable() {
		return shareable;
	}

	public void setShareable(int shareable) {
		this.shareable = shareable;
	}

}
