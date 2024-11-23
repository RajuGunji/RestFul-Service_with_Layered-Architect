package in.io.org.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.io.org.Entity.BookEntity;
import in.io.org.Repository.Book_Repository;
@Service
public class BookService_Impl implements BookService
{
	Book_Repository br;
	public BookService_Impl(Book_Repository br)
	{
		this.br=br;
	}
	@Override
	public String addBookOrUpdate(BookEntity book) 
	{
		Integer BookID=book.getBookID();
		BookEntity save=br.save(book);
		if(BookID==null)
		{
			return "Book got Added into Record";
		}
		else
			return "Book got Updated";
	}

	@Override
	public List<BookEntity> getBooks()
	{
		List<BookEntity> booksList=br.findAll();
		return booksList;
	}

	@Override
	public String DeleteBook(Integer BookID)
	{
		br.deleteById(BookID);
		return "Book record got Deleted";
	}

}
