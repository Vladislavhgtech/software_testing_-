package ru.miet.testing.lab3;

public class Author {
	
	// фамилия автора
	private String surname;
	// имя автора
	private String name;
    private String bookName;

    public Author(String surname, String name, String bookName) {
        this.surname = surname;
        this.name = name;
        this.bookName = bookName;
    }

    public String getAuthorInfo(){
        return ("\""+ surname + "\"" + name + "\" Автор: " + bookName);
    }
}
