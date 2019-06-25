package com.app.document;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@Id
	private String id;

	private String bookCode;
	private String  bookAuth;
	private String  bookCost;
	private List<String> Codes;
	private String[] grades;
	public Book() {
		super();
	}
	public Book(String bookCode, String bookAuth, String bookCost, List<String> codes, String[] grades) {
		super();
		this.bookCode = bookCode;
		this.bookAuth = bookAuth;
		this.bookCost = bookCost;
		Codes = codes;
		this.grades = grades;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	public String getBookCost() {
		return bookCost;
	}
	public void setBookCost(String bookCost) {
		this.bookCost = bookCost;
	}
	public List<String> getCodes() {
		return Codes;
	}
	public void setCodes(List<String> codes) {
		Codes = codes;
	}
	public String[] getGrades() {
		return grades;
	}
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookCode=" + bookCode + ", bookAuth=" + bookAuth + ", bookCost=" + bookCost
				+ ", Codes=" + Codes + ", grades=" + Arrays.toString(grades) + "]";
	}
	
		
}
