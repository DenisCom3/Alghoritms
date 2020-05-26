package Learning;
class A {
    public interface IF {
        boolean isNotNegative (int x);
    }
}


class B implements A.IF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
public class AB {
    public static void main(String[] args) {
        A.IF nif = new B();
        System.out.println(nif.isNotNegative(11));

    }
}
