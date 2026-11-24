package a;

import android.gov.nist.core.Separators;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class y4 implements ig00 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(y4.class.getName());
    public static final p8a f;
    public static final Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f41976a;
    public volatile u4 b;
    public volatile x4 c;

    static {
        p8a w4Var;
        try {
            w4Var = new v4(AtomicReferenceFieldUpdater.newUpdater(x4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x4.class, x4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y4.class, x4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y4.class, u4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            w4Var = new w4();
        }
        f = w4Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(y4 y4Var) {
        x4 x4Var;
        u4 u4Var;
        u4 u4Var2;
        u4 u4Var3;
        do {
            x4Var = y4Var.c;
        } while (!f.O(y4Var, x4Var, x4.c));
        while (true) {
            u4Var = null;
            if (x4Var == null) {
                break;
            }
            Thread thread = x4Var.f40243a;
            if (thread != null) {
                x4Var.f40243a = null;
                LockSupport.unpark(thread);
            }
            x4Var = x4Var.b;
        }
        y4Var.c();
        do {
            u4Var2 = y4Var.b;
        } while (!f.M(y4Var, u4Var2, u4.d));
        while (true) {
            u4Var3 = u4Var;
            u4Var = u4Var2;
            if (u4Var == null) {
                break;
            }
            u4Var2 = u4Var.c;
            u4Var.c = u4Var3;
        }
        while (u4Var3 != null) {
            u4 u4Var4 = u4Var3.c;
            e(u4Var3.f35020a, u4Var3.b);
            u4Var3 = u4Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof r4) {
            Throwable th = ((r4) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof t4) {
            throw new ExecutionException(((t4) obj).f33293a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // a.ig00
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        u4 u4Var = this.b;
        u4 u4Var2 = u4.d;
        if (u4Var != u4Var2) {
            u4 u4Var3 = new u4(runnable, executor);
            do {
                u4Var3.c = u4Var;
                if (f.M(this, u4Var, u4Var3)) {
                    return;
                } else {
                    u4Var = this.b;
                }
            } while (u4Var != u4Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        r4 r4Var;
        Object obj = this.f41976a;
        if (obj == null) {
            if (d) {
                r4Var = new r4(new CancellationException("Future.cancel() was called."), z);
            } else {
                r4Var = z ? r4.c : r4.d;
            }
            if (f.N(this, obj, r4Var)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        x4 x4Var = x4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f41976a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            x4 x4Var2 = this.c;
            if (x4Var2 != x4Var) {
                x4 x4Var3 = new x4();
                while (true) {
                    p8a p8aVar = f;
                    p8aVar.b0(x4Var3, x4Var2);
                    if (p8aVar.O(this, x4Var2, x4Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(x4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f41976a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(x4Var3);
                        break;
                    }
                    x4Var2 = this.c;
                    if (x4Var2 == x4Var) {
                    }
                }
            }
            return f(this.f41976a);
        }
        while (nanos > 0) {
            Object obj3 = this.f41976a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbQ = kng0.q(j, "Waited ", Separators.SP);
        sbQ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbQ.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + Separators.SP + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(Separators.COMMA);
                }
                strConcat = strConcat2.concat(Separators.SP);
            }
            if (z) {
                strConcat = axq.h(nanos2, strConcat, " nanoseconds ");
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(kng0.l(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41976a instanceof r4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f41976a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(x4 x4Var) {
        x4Var.f40243a = null;
        while (true) {
            x4 x4Var2 = this.c;
            if (x4Var2 == x4.c) {
                return;
            }
            x4 x4Var3 = null;
            while (x4Var2 != null) {
                x4 x4Var4 = x4Var2.b;
                if (x4Var2.f40243a != null) {
                    x4Var3 = x4Var2;
                } else if (x4Var3 != null) {
                    x4Var3.b = x4Var4;
                    if (x4Var3.f40243a == null) {
                    }
                } else if (!f.O(this, x4Var2, x4Var4)) {
                }
                x4Var2 = x4Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.N(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.N(this, null, new t4(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f41976a instanceof r4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e2) {
                strJ = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                hne.B(sb, "PENDING, info=[", strJ, "]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        x4 x4Var = x4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41976a;
            if (obj2 != null) {
                return f(obj2);
            }
            x4 x4Var2 = this.c;
            if (x4Var2 != x4Var) {
                x4 x4Var3 = new x4();
                do {
                    p8a p8aVar = f;
                    p8aVar.b0(x4Var3, x4Var2);
                    if (p8aVar.O(this, x4Var2, x4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41976a;
                            } else {
                                k(x4Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    x4Var2 = this.c;
                } while (x4Var2 != x4Var);
            }
            return f(this.f41976a);
        }
        throw new InterruptedException();
    }
}
