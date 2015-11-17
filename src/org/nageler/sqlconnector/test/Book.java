package org.nageler.sqlconnector.test;

import org.nageler.sqlconnector.annotation.SqlField;
import org.nageler.sqlconnector.annotation.SqlReadOnly;
import org.nageler.sqlconnector.annotation.SqlTable;

import lombok.ToString;

@SqlTable("book")
@ToString
public class Book {
	@SqlReadOnly
	@SqlField(primaryKey = true)
	public Integer id = 0;
	
	@SqlField
	public String name;
	
	@SqlField
	public String author;

	public Book() {
		
	}
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	
	
}
