package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class b0 {
    private static b0 b;
    private static b0 c;
    private static b0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f45849a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f45850a;

        public a(Runnable runnable) {
            this.f45850a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f45850a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    public static class b implements ThreadFactory {
        private static final AtomicInteger d = new AtomicInteger(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadGroup f45851a;
        private final AtomicInteger b = new AtomicInteger(1);
        private final String c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f45851a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.c = "FormalHASDK-base-" + d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f45851a, runnable, this.c + this.b.getAndIncrement(), 0L);
        }
    }

    static {
        new b0();
        new b0();
        b = new b0();
        c = new b0();
        d = new b0();
    }

    private b0() {
    }

    public static b0 b() {
        return c;
    }

    public static b0 c() {
        return b;
    }

    public void a(g gVar) {
        try {
            this.f45849a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }

    public static b0 a() {
        return d;
    }
}
