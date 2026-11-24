package okhttp3.internal.connection;

import a.axq;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46147a;
    public final TaskQueue b;
    public final RealConnectionPool$cleanupTask$1 c;
    public final ConcurrentLinkedQueue d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        TimeUnit.MINUTES.getClass();
        this.f46147a = 300000000000L;
        this.b = taskRunner.newQueue();
        final String strN = axq.n(new StringBuilder(), _UtilJvmKt.b, " ConnectionPool connection closer");
        this.c = new Task(strN) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                RealConnectionPool realConnectionPool = this.e;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - realConnectionPool.f46147a) + 1;
                Iterator it = realConnectionPool.d.iterator();
                it.getClass();
                RealConnection realConnection = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it.next();
                    realConnection4.getClass();
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = realConnection4.r;
                            if (j3 < j) {
                                realConnection2 = realConnection4;
                                j = j3;
                            }
                            i++;
                            if (j3 < j2) {
                                realConnection3 = realConnection4;
                                j2 = j3;
                            }
                        }
                    }
                }
                if (realConnection2 != null) {
                    realConnection = realConnection2;
                } else if (i > 5) {
                    j = j2;
                    realConnection = realConnection3;
                } else {
                    j = -1;
                }
                if (realConnection == null) {
                    if (realConnection3 != null) {
                        return (j2 + realConnectionPool.f46147a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return realConnectionPool.f46147a;
                    }
                    return -1L;
                }
                synchronized (realConnection) {
                    if (!realConnection.q.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.r != j) {
                        return 0L;
                    }
                    realConnection.k = true;
                    realConnectionPool.d.remove(realConnection);
                    _UtilJvmKt.c(realConnection.e);
                    if (realConnectionPool.d.isEmpty()) {
                        realConnectionPool.b.a();
                    }
                    return 0L;
                }
            }
        };
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        ArrayList arrayList = realConnection.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.c.f46114a.i + " was leaked. Did you forget to close a response body?";
                Platform platform = Platform.f46208a;
                Platform.f46208a.l(((RealCall.CallReference) reference).f46146a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.r = j - this.f46147a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
