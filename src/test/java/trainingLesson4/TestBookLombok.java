package trainingLesson4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBookLombok {
    Book book = new Book();

    @Before
    public void setUp() {

        book.setAuthor("Jack London");
        book.setGenre("Adventure");
        book.setName("White Fang");
        book.setYear(1906);
        book.setISBN("EngSomething-1234567890");
    }

    @Test
    public void bookCheck() {

        assertThat(book.getName()).isEqualTo("White Fang");
        assertThat(book.getAuthor()).isEqualTo("Jack London");
        assertThat(book.getGenre()).isEqualTo("Adventure");
        assertThat(book.getYear()).isEqualTo(1906);
        assertThat(book.getISBN()).isEqualTo("EngSomething-1234567890");
    }

    @After
    public void tearDown() {
        book = null;
    }

}