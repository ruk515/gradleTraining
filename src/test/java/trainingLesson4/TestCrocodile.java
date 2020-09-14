package trainingLesson4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCrocodile {
    Crocodile crocodile = new Crocodile();

    @Before

    public void setUp() {
        crocodile.setColor("Blue");
        crocodile.setHungry(true);
        crocodile.setLength(333);
        crocodile.setName("Debil");
        crocodile.setSize('L');
    }

    @Test
    public void crocodileCheck() {
        assertThat(crocodile.getColor()).isEqualTo("Blue");
        assertThat(crocodile.isHungry()).isEqualTo(true);
        assertThat(crocodile.getLength()).isEqualTo(333);
        assertThat(crocodile.getName()).isEqualTo("Debil");
        assertThat(crocodile.getSize()).isEqualTo('L');
    }

    @After
    public void tearDown() {
        crocodile = null;
    }
}
