package com.Yotta.elasticSearch.Tanmay.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

//@Document(indexName = "log")
//@Setting(settingPath = "static/es-settings.json")
public class Log {
	//@Field(type = FieldType.Keyword)
	private long id;
	
	//@Field(type = FieldType.Text )
	private String data;

	public Log(long id, String data) {
		super();
		this.id = id;
		this.data = data;
	}

	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
