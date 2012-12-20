package maven.repository.content.test;

import java.lang.reflect.Method;

import maven.repository.content.Artifact;

import org.junit.Test;
import org.springframework.util.Assert;

public class ContentTest {

    @Test
    public void testIsEnhanced() {
        Method[] methods = Artifact.class.getMethods();
        boolean flag = false;
        for (Method method : methods) {
            System.out.println(""+method.getName());
            if (method.getName().startsWith("jdo")) {
                flag = true;
            } // if
        } // for
        Assert.isTrue(flag, "Classes not enhanced - output unusable");
    } // testIsEnhanced()

} // ContentTest
