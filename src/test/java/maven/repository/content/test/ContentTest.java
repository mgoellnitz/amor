/**
 * 
 * Copyright 2012 Martin Goellnitz
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package maven.repository.content.test;

import java.lang.reflect.Method;

import maven.repository.content.Artifact;

import org.junit.Test;
import org.junit.Assert;

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
        Assert.assertTrue("Classes not enhanced - output unusable", flag);
    } // testIsEnhanced()

} // ContentTest
