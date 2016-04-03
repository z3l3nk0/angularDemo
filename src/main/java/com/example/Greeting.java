package com.example;

public class Greeting {
	
	private int id;
	private String content;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	
	public Greeting(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	
	
	

}
