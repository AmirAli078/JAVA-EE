package Dao;

import java.util.List;

import entity.BookDtls;

public interface BookDao {
	public boolean addBook(BookDtls b);
     public List <BookDtls> getAllBooks();
     public BookDtls getBookById(int id);
     public boolean updateEditBook(BookDtls d);
     public boolean deletBooks(int id);
}
