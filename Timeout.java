package com.mkyong.testng.examples.timeout;

import org.testng.annotations.Test;

public class TestTimeout {

	@Test(timeOut = 5000) // time in mulliseconds
	public void testThisShouldPass() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test(timeOut = 1000)
	public void testThisShouldFail() {
		while (true);
	}

}

OUTPUT:

[TestNG] Running:

PASSED: testThisShouldPass
FAILED: testThisShouldFail
org.testng.internal.thread.ThreadTimeoutException: Method org.testng.internal.TestNGMethod.testThisShouldFail() didn't finish within the time-out 1000
	at com.mkyong.testng.examples.timeout.TestTimeout.testThisShouldFail(TestTimeout.java:14)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:46)
	at org.testng.internal.InvokeMethodRunnable.run(InvokeMethodRunnable.java:37)
	at java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)


===============================================
    Default test
    Tests run: 2, Failures: 1, Skips: 0
===============================================