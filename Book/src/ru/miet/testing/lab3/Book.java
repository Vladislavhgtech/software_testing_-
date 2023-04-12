package ru.miet.testing.lab3;

import java.util.ArrayList;

public class Book {
	
	private ArrayList<Author> authors = new ArrayList<Author>();
	
	
	
	// фамилия автора
	private String surname;
	// имя автора
	private String name;
	// название книги
	private String title;
	// год выпуска книги
	private int year;
	// тираж
	private int circulation;


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCirculation() {
		return circulation;
	}

	public void setCirculation(int circulation) {
		this.circulation = circulation;
	}
	
	public void addAuthors(String surname, String name, String title) {
		
		authors.add(new Author(surname, name, title));
		
	} 
	
	public Book(String surname, String name, String title, int year, int circulation) {
			if (surname == null || surname == null || title == null || year < 1000 || circulation < 0) {
			    // если в конструктор были переданы некорректные данные, необходимо
			    // "выкинуть" исключение подходящего типа
			    throw new IllegalArgumentException();
			}
			this.name = name;
			this.surname = surname;
			this.title = title;
			this.year=year;
			this.circulation=circulation;
		    }
	
	public StringBuilder getBookInfo(){
		 StringBuilder mainString= new StringBuilder("\""+ surname + "\"" + name + "\" Книга: " + title + "\" Год: "+ year + "\" Тираж: " + circulation);
		 if (authors.size()!=0) {
			 for (int i=0; i<authors.size(); i++) {
				 mainString.append(authors.get(i).getAuthorInfo());
			 }
			 
		 }
		
	        return  mainString;
	    }

}
