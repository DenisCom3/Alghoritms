import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListClientExample {
    private List list;

    public ListClientExample() {
        list = new LinkedList();
    }

    List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}
