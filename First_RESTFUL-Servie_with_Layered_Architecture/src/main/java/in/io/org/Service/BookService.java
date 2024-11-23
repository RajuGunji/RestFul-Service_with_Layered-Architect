package in.io.org.Service;

import java.util.List;

import in.io.org.Entity.BookEntity;

public interface BookService
{
	public String addBookOrUpdate(BookEntity book);
	public List<BookEntity> getBooks();
	public String DeleteBook(Integer BookID);
}
