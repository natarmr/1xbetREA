package a;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class euj extends jeo implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final euj k;
    public static final long l;

    static {
        Long l2;
        euj eujVar = new euj();
        k = eujVar;
        eujVar.F(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // a.jeo
    public final void J(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.J(runnable);
    }

    @Override // a.jeo
    public final Thread Q() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // a.jeo
    public final void S(long j, heo heoVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void U() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = defpackage.a.f0a;
            unsafe.putObjectVolatile(this, jeo.i, (Object) null);
            unsafe.putObjectVolatile(this, jeo.g, (Object) null);
            notifyAll();
        }
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return a660.f303a;
        }
        long jNanoTime = System.nanoTime();
        geo geoVar = new geo(runnable, j2 + jNanoTime);
        T(jNanoTime, geoVar);
        return geoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gcq0.f11075a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    U();
                    if (R()) {
                        return;
                    }
                    Q();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jH = H();
                    if (jH == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = l + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            U();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        if (jH > j2) {
                            jH = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jH > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            U();
                            if (R()) {
                                return;
                            }
                            Q();
                            return;
                        }
                        LockSupport.parkNanos(this, jH);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            U();
            if (!R()) {
                Q();
            }
            throw th;
        }
    }

    @Override // a.jeo, a.eeo
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // a.lne
    public final String toString() {
        return "DefaultExecutor";
    }
}
