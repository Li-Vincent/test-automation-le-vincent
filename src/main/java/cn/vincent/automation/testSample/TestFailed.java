package cn.vincent.automation.testSample;

import org.testng.annotations.Test;

public class TestFailed {
    @Test(groups = "sfdsfds")
    public void testFailed() {
        assert false : "This test failed.";
    }
}
