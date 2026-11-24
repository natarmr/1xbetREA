package com.huawei.hms.opendevice;

import a.ohs0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadGroup f45911a;
    private int b = 1;
    private final String c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f45911a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.c = ohs0.n(str, "-pool-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.b++;
        }
        Thread thread = new Thread(this.f45911a, runnable, this.c + this.b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
