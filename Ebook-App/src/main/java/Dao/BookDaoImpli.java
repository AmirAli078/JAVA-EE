package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.BookDtls;

public class BookDaoImpli implements BookDao {
	
	private Connection connection;

	public BookDaoImpli(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addBook(BookDtls b) {
		boolean f=false;
		try {
			String sql = "INSERT INTO book_dtls (bookname, auther, price, bookCategory, status, photo, user_email) VALUES (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuther());
			ps.setString(3, b.getPrice());
			ps.setString(4, b.getBookCategory());
			ps.setString(5, b.getStatus());
			ps.setString(6, b.getPhotoName());
			ps.setString(7, b.getEmail());
			
		int i= ps.executeUpdate();
		if(i==1) {
			f=true;
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<BookDtls> getAllBooks() {
		List<BookDtls> list=new ArrayList<BookDtls>();
		BookDtls b=null;
		try {
		    String sql="select * from book_dtls";
		    PreparedStatement ps=connection.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	b=new BookDtls();
		    	//b.setBookId(rs.getInt(1));
		    	b.setBookId(rs.getInt(1));
		    	b.setBookName(rs.getString(2));
		    	b.setAuther(rs.getString(3));
		    	b.setPrice(rs.getString(4));
		    	b.setBookCategory(rs.getString(5));
		    	b.setStatus(rs.getString(6));
		    	b.setPhotoName(rs.getString(7));
		    	b.setEmail(rs.getString(8));
		    	list.add(b);
		    }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public BookDtls getBookById(int id) {
		BookDtls b=null;
		
		try {
			String sql="select * from book_dtls where bookId=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			 ResultSet rs=ps.executeQuery();
			    while(rs.next()) {
			    	b=new BookDtls();
			    	//b.setBookId(rs.getInt(1));
			    	b.setBookId(rs.getInt(1));
			    	b.setBookName(rs.getString(2));
			    	b.setAuther(rs.getString(3));
			    	b.setPrice(rs.getString(4));
			    	b.setBookCategory(rs.getString(5));
			    	b.setStatus(rs.getString(6));
			    	b.setPhotoName(rs.getString(7));
			    	b.setEmail(rs.getString(8));
			// b.getBookId();
			    }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	public boolean updateEditBook(BookDtls d) {
		boolean f=false;
		
		try {
			String sql="update book_dtls set bookname=?, auther=?, price=?,status=? where bookId=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, d.getBookName());
			ps.setString(2, d.getAuther());
			ps.setString(3, d.getPrice());
			ps.setString(4,d.getStatus());
			ps.setInt(5,d.getBookId());
		int i=	ps.executeUpdate();
		
		if(i==1) {
			f= true;
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}

	@Override
	public boolean deletBooks(int id) {
	boolean f=false;
	try {
		String sql="delete from book_dtls where bookId=?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
		return f;
	}

	
}
