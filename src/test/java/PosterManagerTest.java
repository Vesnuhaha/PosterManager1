import org.junit.jupiter.api.Test;
import ru.netology.postermanager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    public void test() {
        PosterManager manager = new PosterManager();
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        String[] expected = {"movie1", "movie2", "movie3"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        PosterManager manager = new PosterManager(10);
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        String[] expected = {"movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        PosterManager manager = new PosterManager(5);
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");

        String[] expected = {"movie7", "movie6", "movie5", "movie4", "movie3"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

}