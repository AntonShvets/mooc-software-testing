import org.junit.jupiter.api.Test;

public class NumFinderTest {

    @Test
    public void desc() {

        int intArray[] ={ 4,3,2,1 };

        new NumFinder().find(intArray);
    }

    @Test
    public void asc() {

        int intArray[] ={ 1,2,3,4 };

        new NumFinder().find(intArray);
    }

    @Test
    public void random() {

        int intArray[] ={ 15,4,72,15,123,45,1,8,7 };

        new NumFinder().find(intArray);
    }

}
