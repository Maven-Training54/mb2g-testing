package guru.springframework;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class JUnit5Test {

    @Test
    void exampleTest(){
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());

    }
}
