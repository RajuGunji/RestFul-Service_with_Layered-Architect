package in.io.org.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.io.org.Entity.BookEntity;
import in.io.org.Service.BookService;

@RestController
public class BookController 
{
	BookService bs;
	
	public BookController(BookService bs)
	{
		this.bs=bs;
	}
	@PostMapping("/insert")
	public ResponseEntity<String > insertBook(@RequestBody BookEntity book)
	{
		String msg=bs.addBookOrUpdate(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/retrieve")
	public ResponseEntity<List<BookEntity>> retrieveBook(@PathVariable BookEntity book)
	{
		List<BookEntity> books=bs.getBooks();
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateBook(@RequestBody BookEntity book)
	{
		String msg=bs.addBookOrUpdate(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{BookID}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer BookID)
	{
		String mssg=bs.DeleteBook(BookID);
		return new ResponseEntity<>(mssg,HttpStatus.OK);
	}
	
}
