package a;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ps30 {
    public static final f03 f = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f27496a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public ps30() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.f27496a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final synchronized void a(long j, Timer timer) {
        this.e = j;
        try {
            this.d = this.f27496a.scheduleAtFixedRate(new os30(this, timer, (byte) 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final m03 b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jA = timer.a() + timer.f45671a;
        l03 l03VarR = m03.r();
        l03VarR.i();
        ((m03) l03VarR.b).s(jA);
        Runtime runtime = this.c;
        int iB = gut0.b((brm0.c(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024);
        l03VarR.i();
        ((m03) l03VarR.b).t(iB);
        return (m03) l03VarR.h();
    }
}
