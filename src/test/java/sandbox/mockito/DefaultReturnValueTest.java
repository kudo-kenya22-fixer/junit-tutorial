package sandbox.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class DefaultReturnValueTest {
    @Test
    void test() {
        Hoge mock = mock(Hoge.class);

        System.out.println("mock.anyObject()        = " + mock.anyObject());
        System.out.println("mock.primitive()        = " + mock.primitive());
        System.out.println("mock.primitiveWrapper() = " + mock.primitiveWrapper());
        System.out.println("mock.array()            = " + mock.array());
        System.out.println("mock.collection()       = " + mock.collection());
    }

    public class Hoge {
        public String anyObject() {
            System.out.println("Hello World");
            return "Hello World";
        }

        public int primitive() {
            return 1;
        }

        public Integer primitiveWrapper() {
            return 2;
        }

        public int[] array() {
            return new int[] {1, 2, 3};
        }

        public List<String> collection() {
            return List.of("hello", "world");
        }
    }
}