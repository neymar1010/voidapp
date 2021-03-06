package com.webapp.entity;

public class Media {
	 private int  id; 
	 private String  title;//'视频名称' 
	 private String  src; //'视频存放地址' ,
	 private String  picture; //'视频截图' ,
	 private String  descript; // '视频描述' ,
	 private String  uptime; //'上传时间'
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", src=" + src
				+ ", picture=" + picture + ", descript=" + descript
				+ ", uptime=" + uptime + "]";
	}
	public Media(){
		
	}
	public Media(int id, String title, String src, String picture,
			String descript, String uptime) {
		super();
		this.id = id;
		this.title = title;
		this.src = src;
		this.picture = picture;
		this.descript = descript;
		this.uptime = uptime;
	}
	
}
