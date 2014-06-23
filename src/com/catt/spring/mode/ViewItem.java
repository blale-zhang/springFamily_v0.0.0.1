package com.catt.spring.mode;

public class ViewItem {

	private int type;// 1:js,2:css,3:less,4:png
	private String name;
	private String version;
	private String path;
	private int prop;
	private String sProp;
	private int priority;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getProp() {
		return prop;
	}

	public void setProp(int prop) {
		this.prop = prop;
	}

	public String getsProp() {
		return sProp;
	}

	public void setsProp(String sProp) {
		this.sProp = sProp;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}
