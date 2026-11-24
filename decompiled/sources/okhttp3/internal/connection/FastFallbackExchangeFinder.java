package okhttp3.internal.connection;

import a.tjo;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.ech.EchUntrustedException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastFallbackExchangeFinder implements ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f46143a;
    public final TaskRunner b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final BlockingQueue e;

    public FastFallbackExchangeFinder(RealRoutePlanner realRoutePlanner, TaskRunner taskRunner) {
        taskRunner.getClass();
        this.f46143a = realRoutePlanner;
        this.b = taskRunner;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = taskRunner.getBackend().b(new LinkedBlockingDeque());
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws IOException {
        RoutePlanner.ConnectResult connectResultD;
        long j;
        RoutePlanner.ConnectResult connectResult;
        RealRoutePlanner realRoutePlanner = this.f46143a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !realRoutePlanner.a(null)) {
                    break;
                }
                if (realRoutePlanner.l.r) {
                    throw new IOException("Canceled");
                }
                long jE = this.b.getBackend().e();
                long j2 = this.c - jE;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    connectResultD = d();
                    j = 250000000;
                    this.c = jE + 250000000;
                } else {
                    j = j2;
                    connectResultD = null;
                }
                if (connectResultD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (connectResult = (RoutePlanner.ConnectResult) this.e.poll(j, timeUnit)) == null) {
                        connectResultD = null;
                    } else {
                        copyOnWriteArrayList.remove(connectResult.f46151a);
                        connectResultD = connectResult;
                    }
                    if (connectResultD == null) {
                    }
                }
                RoutePlanner.Plan plan = connectResultD.f46151a;
                boolean z = false;
                if (connectResultD.b == null && connectResultD.c == null) {
                    c();
                    if (!plan.isReady()) {
                        connectResultD = plan.getF46142a();
                    }
                    if (connectResultD.b == null && connectResultD.c == null) {
                        z = true;
                    }
                    if (z) {
                        RealConnection f46149a = connectResultD.f46151a.getF46149a();
                        c();
                        return f46149a;
                    }
                }
                Throwable th = connectResultD.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        tjo.a(iOException, th);
                    }
                    if (((IOException) th) instanceof EchUntrustedException) {
                        break;
                    }
                }
                RoutePlanner.Plan plan2 = connectResultD.b;
                if (plan2 != null) {
                    realRoutePlanner.q.addFirst(plan2);
                }
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        }
        c();
        iOException.getClass();
        throw iOException;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f46143a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan planA = plan.a();
            if (planA != null) {
                this.f46143a.q.addLast(planA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RealRoutePlanner realRoutePlanner = this.f46143a;
        if (realRoutePlanner.a(null)) {
            try {
                failedPlan = realRoutePlanner.c();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.isReady()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).f46142a;
            }
            this.d.add(failedPlan);
            final String str = _UtilJvmKt.b + " connect " + realRoutePlanner.j.i.h();
            this.b.newQueue().d(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long b() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.g();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.d.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.e.put(connectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
