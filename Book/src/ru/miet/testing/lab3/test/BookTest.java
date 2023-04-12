package ru.miet.testing.lab3.test;

import static org.junit.Assert.*;
import ru.miet.testing.lab3.*;

import org.junit.Test;

public class BookTest {
	private Book first=new Book("Шолохов", "Михаил", "Тихий дон", 1925, 1000);
	private Book second=new Book("Иванов", "Иван", "Привет", 1915, 100);
	private Book third=new Book("Петров", "Петр", "Пока", 1985, 50);
	
	@Test
	public void testBookGetSetInitializing() {
		// проверка корректного срабатывания конструктора
		assertTrue(first.getName().equals("Шолохов"));
		        assertTrue(first.getSurname().equals("Михаил"));
		        assertTrue(first.getYear() == 1925);

		        // проверка задания значений через set-методы (сеттеры)
		        first.setName("MooOld");
		        first.setYear(2000);
		        first.setCirculation(20);
		        assertTrue(first.getSurname().equals("MooOld"));
		        assertTrue(first.getYear() == 2000);
		        assertTrue(first.getCirculation() == 20);
	    }
	
	// тесты, проверяющие, бросается ли исключение "Аргумент неверного типа" при
    // создании новой книги c некорректными параметрами (меньше нуля и
    // равными нулю)
    @Test(expected = IllegalArgumentException.class)
    public void testBookNullName() {
    	Book nullBook=new Book(null, "Михаил", "Тихий дон", 200, 1000);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnimalNegativeHeight() {
	        Book bookNegativeYear = new Book("Иванов", "Иван", "Привет", -1915, 100);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBookNegativeCirculation() {
        Book bookNegativeCirculation = new Book("Иванов", "Иван", "Привет", 1915, -100);
    }
    
 
    //Тестирование метода Getbookinfo
    @Test
	public void testAnimalGetSetInitializing() {
		// проверка корректного срабатывания конструктора
    	first.addAuthors("Иванов_2", "Иван_2", "ничего не написал");
    	
    	
		assertTrue(first.getBookInfo().equals("Шолохов\"Михаил\" Книга: Тихий дон\" Год: 1925\" Тираж: 1000\"Иванов\"Иван\" Автор: ничего не написал"));
		      
	    }
    
	



}
