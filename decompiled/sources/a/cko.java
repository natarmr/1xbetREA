package a;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class cko extends bko implements vzj {
    public final Executor c;

    public cko(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = rqd.f30926a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = rqd.f30926a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // a.vzj
    public final void a(long j, n5a n5aVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            mfr mfrVar = new mfr((Object) this, (Object) n5aVar, (byte) 12);
            CoroutineContext coroutineContext = n5aVar.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(mfrVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                zvw.F(coroutineContext, plc.b("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            n5aVar.u(new b5a(scheduledFutureSchedule, (byte) 0));
        } else {
            euj.k.a(j, n5aVar);
        }
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                zvw.F(coroutineContext, plc.b("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new mwk(scheduledFutureSchedule) : euj.k.c(j, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cko) && ((cko) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            zvw.F(coroutineContext, plc.b("The task was rejected", e));
            rwj rwjVar = tvk.f34603a;
            dvj.c.q(coroutineContext, runnable);
        }
    }

    @Override // a.lne
    public final String toString() {
        return this.c.toString();
    }

    @Override // a.bko
    public final Executor x() {
        return this.c;
    }
}
