package a;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class o23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f24511a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        threadFactoryDefaultThreadFactory.getClass();
        b = threadFactoryDefaultThreadFactory;
    }

    public static ScheduledExecutorService a(l23 l23Var, int i) {
        if (i <= 0) {
            c99.s(ua80.e(i, "Threads (", ") must be > 0"));
            return null;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, l23Var);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static m23 b(String str, ThreadFactory threadFactory) {
        threadFactory.getClass();
        return new m23(threadFactory, str, o2e.Y(0));
    }
}
