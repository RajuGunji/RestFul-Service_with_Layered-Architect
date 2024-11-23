package in.io.org.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="BookData")
public class BookEntity 
{
	@Column(name="Book_Name")
	private String bookName;
	@Id
	@Column(name="Book_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookID;
	@Column(name="Book_Price")
	private Double bookPrice;
	@Column(name="Book_Author")
	private String bookAuthor;
}
/*
	
*/