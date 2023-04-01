import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {
    @Test
    public void test1() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        String[] expected = {"Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
    }


}

