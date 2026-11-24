package okhttp3;

import a.m4w0;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Dispatcher;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Dispatcher {
    public ThreadPoolExecutor c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f46089a = 64;
    public byte b = 5;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();

    public static void c(Dispatcher dispatcher, RealCall.AsyncCall asyncCall, RealCall realCall, RealCall.AsyncCall asyncCall2, int i) {
        Dispatcher$promoteAndExecute$Effects dispatcher$promoteAndExecute$Effects;
        RealCall.AsyncCall asyncCallB;
        if ((i & 1) != 0) {
            asyncCall = null;
        }
        if ((i & 2) != 0) {
            realCall = null;
        }
        if ((i & 4) != 0) {
            asyncCall2 = null;
        }
        dispatcher.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        boolean zIsShutdown = dispatcher.a().isShutdown();
        synchronized (dispatcher) {
            if (realCall != null) {
                try {
                    if (!dispatcher.f.remove(realCall)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (asyncCall2 != null) {
                asyncCall2.b.decrementAndGet();
                if (!dispatcher.e.remove(asyncCall2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (asyncCall != null) {
                dispatcher.d.add(asyncCall);
                RealCall realCall2 = RealCall.this;
                if (!realCall2.c && (asyncCallB = dispatcher.b(realCall2.b.f46108a.d)) != null) {
                    asyncCall.b = asyncCallB.b;
                }
            }
            if ((realCall != null || asyncCall2 != null) && (zIsShutdown || dispatcher.e.isEmpty())) {
                dispatcher.f.isEmpty();
            }
            if (zIsShutdown) {
                List listL0 = CollectionsKt.L0(dispatcher.d);
                dispatcher.d.clear();
                dispatcher$promoteAndExecute$Effects = new Dispatcher$promoteAndExecute$Effects(listL0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = dispatcher.d.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall3 = (RealCall.AsyncCall) it.next();
                    if (dispatcher.e.size() >= dispatcher.f46089a) {
                        break;
                    }
                    if (asyncCall3.b.get() < dispatcher.b) {
                        it.remove();
                        asyncCall3.b.incrementAndGet();
                        arrayList.add(asyncCall3);
                        dispatcher.e.add(asyncCall3);
                    }
                }
                dispatcher$promoteAndExecute$Effects = new Dispatcher$promoteAndExecute$Effects(arrayList);
            }
        }
        int size = dispatcher$promoteAndExecute$Effects.f46090a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            RealCall.AsyncCall asyncCall4 = (RealCall.AsyncCall) dispatcher$promoteAndExecute$Effects.f46090a.get(i2);
            if (asyncCall4 == asyncCall) {
                z = false;
            } else {
                RealCall.this.eventListener.l(RealCall.this, dispatcher);
            }
            if (zIsShutdown) {
                asyncCall4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                RealCall realCall3 = RealCall.this;
                realCall3.f(interruptedIOException);
                asyncCall4.f46145a.b(realCall3, interruptedIOException);
            } else {
                ExecutorService executorServiceA = dispatcher.a();
                asyncCall4.getClass();
                RealCall realCall4 = RealCall.this;
                realCall4.f46144a.f46105a.getClass();
                try {
                    try {
                        executorServiceA.execute(asyncCall4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        RealCall realCall5 = RealCall.this;
                        realCall5.f(interruptedIOException2);
                        asyncCall4.f46145a.b(realCall5, interruptedIOException2);
                        Dispatcher dispatcher2 = realCall4.f46144a.f46105a;
                        dispatcher2.getClass();
                        c(dispatcher2, null, null, asyncCall4, 3);
                    }
                } catch (Throwable th2) {
                    Dispatcher dispatcher3 = realCall4.f46144a.f46105a;
                    dispatcher3.getClass();
                    c(dispatcher3, null, null, asyncCall4, 3);
                    throw th2;
                }
            }
        }
        if (!z || asyncCall == null) {
            return;
        }
        RealCall.this.eventListener.m(RealCall.this, dispatcher);
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.c;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new m4w0(_UtilJvmKt.b + " Dispatcher", false));
            this.c = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    public final RealCall.AsyncCall b(String str) {
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (Intrinsics.d(RealCall.this.b.f46108a.d, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.d.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (Intrinsics.d(RealCall.this.b.f46108a.d, str)) {
                return asyncCall2;
            }
        }
        return null;
    }
}
