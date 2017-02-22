package bookapplication1;



import java.util.List;

import org.junit.Test;

public class TestBookDAO {

	BookDAO dao=new BookDAO();

	@Test
	public void test() {
Book book=new Book();
book.setName("java");
book.setPrice( 200f);
dao.save(book);
	}
	public void testFindAll()
	{
	dao.findAll();
	List<Book> list=dao.findAll();
	for(Book b:list)
		System.out.println(b);
	}

}
