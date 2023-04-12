package ru.miet.testing.lab3;

public class Main {
	
	public static void main(String[] args)
	{
		Book first=new Book("Шолохов", "Михаил", "Тихий дон", 1925, 1000);
		
		System.out.println(first.getBookInfo());
		
		first.addAuthors("Иванов", "Иван", "ничего не написал");
		
		System.out.println(first.getBookInfo());
		
	}

}
