import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.List;



public class ListClientExampleTest {
    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        assertThat(list, instanceOf(ArrayList.class) );
    }


}
