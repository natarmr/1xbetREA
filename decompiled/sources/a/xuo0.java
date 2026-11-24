package a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xuo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41521a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final gqw0 f;

    static {
        String property;
        int i = bao0.f2270a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f41521a = property;
        b = ktt0.y(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = bao0.f2270a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = ktt0.z(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = ktt0.z(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(ktt0.y(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = gqw0.t1;
    }
}
