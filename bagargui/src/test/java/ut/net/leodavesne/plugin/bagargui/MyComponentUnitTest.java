package ut.net.leodavesne.plugin.bagargui;

import org.junit.Test;
import net.leodavesne.plugin.bagargui.api.MyPluginComponent;
import net.leodavesne.plugin.bagargui.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}