package a;

import android.gov.nist.core.Separators;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l2 extends r2 {
    public static void g(l2 l2Var, boolean z) {
        i2 i2Var = null;
        while (true) {
            for (q2 q2VarE0 = r2.g.e0(l2Var); q2VarE0 != null; q2VarE0 = q2VarE0.b) {
                Thread thread = q2VarE0.f27977a;
                if (thread != null) {
                    q2VarE0.f27977a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            l2Var.e();
            i2 i2Var2 = i2Var;
            i2 i2VarD0 = r2.g.d0(l2Var);
            i2 i2Var3 = i2Var2;
            while (i2VarD0 != null) {
                i2 i2Var4 = i2VarD0.c;
                i2VarD0.c = i2Var3;
                i2Var3 = i2VarD0;
                i2VarD0 = i2Var4;
            }
            while (i2Var3 != null) {
                i2Var = i2Var3.c;
                Runnable runnable = i2Var3.f14025a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f2) {
                    f2 f2Var = (f2) runnable;
                    l2Var = f2Var.f8791a;
                    if (l2Var.f29706a == f2Var) {
                        if (r2.g.b0(l2Var, f2Var, j(f2Var.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = i2Var3.b;
                    Objects.requireNonNull(executor);
                    h(runnable, executor);
                }
                i2Var3 = i2Var;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            r2.e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof e2) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((e2) obj).b);
            throw cancellationException;
        }
        if (obj instanceof h2) {
            throw new ExecutionException(((h2) obj).f12308a);
        }
        if (obj == r2.d) {
            return null;
        }
        return obj;
    }

    public static Object j(ig00 ig00Var) {
        Object obj;
        Throwable thC;
        if (ig00Var instanceof j2) {
            Object e2Var = ((l2) ig00Var).f29706a;
            if (e2Var instanceof e2) {
                e2 e2Var2 = (e2) e2Var;
                if (e2Var2.f7062a) {
                    e2Var = e2Var2.b != null ? new e2(e2Var2.b, false) : e2.d;
                }
            }
            Objects.requireNonNull(e2Var);
            return e2Var;
        }
        if ((ig00Var instanceof r2) && (thC = ((r2) ig00Var).c()) != null) {
            return new h2(thC);
        }
        boolean zIsCancelled = ig00Var.isCancelled();
        boolean z = true;
        if ((!r2.f) && zIsCancelled) {
            e2 e2Var3 = e2.d;
            Objects.requireNonNull(e2Var3);
            return e2Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = ig00Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new h2(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new h2(e);
            } catch (CancellationException e3) {
                if (zIsCancelled) {
                    return new e2(e3, false);
                }
                return new h2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ig00Var, e3));
            } catch (ExecutionException e4) {
                if (!zIsCancelled) {
                    return new h2(e4.getCause());
                }
                return new e2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ig00Var, e4), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? r2.d : obj;
        }
        return new e2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ig00Var), false);
    }

    @Override // a.ig00
    public void a(Runnable runnable, Executor executor) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        x0x.G(executor, "Executor was null.");
        if (!isDone() && (i2Var = this.b) != i2Var2) {
            i2 i2Var3 = new i2(runnable, executor);
            do {
                i2Var3.c = i2Var;
                if (r2.g.a0(this, i2Var, i2Var3)) {
                    return;
                } else {
                    i2Var = this.b;
                }
            } while (i2Var != i2Var2);
        }
        h(runnable, executor);
    }

    @Override // a.r2
    public final Throwable c() {
        if (!(this instanceof j2)) {
            return null;
        }
        Object obj = this.f29706a;
        if (obj instanceof h2) {
            return ((h2) obj).f12308a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        e2 e2Var;
        Object obj = this.f29706a;
        if (!(obj == null) && !(obj instanceof f2)) {
            return false;
        }
        if (r2.f) {
            e2Var = new e2(new CancellationException("Future.cancel() was called."), z);
        } else {
            e2Var = z ? e2.c : e2.d;
            Objects.requireNonNull(e2Var);
        }
        boolean z2 = false;
        while (true) {
            if (r2.g.b0(this, obj, e2Var)) {
                g(this, z);
                if (obj instanceof f2) {
                    ig00 ig00Var = ((f2) obj).b;
                    if (ig00Var instanceof j2) {
                        this = (l2) ig00Var;
                        obj = this.f29706a;
                        if ((obj == null) | (obj instanceof f2)) {
                            z2 = true;
                        }
                    } else {
                        ig00Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f29706a;
            if (!(obj instanceof f2)) {
                return z2;
            }
        }
    }

    public final void d(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        f(sb, obj);
        sb.append("]");
    }

    public final void f(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append(Separators.AT);
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        q2 q2Var = q2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f29706a;
        if ((obj != null) && (!(obj instanceof f2))) {
            return i(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            q2 q2Var2 = this.c;
            if (q2Var2 != q2Var) {
                q2 q2Var3 = new q2();
                z = true;
                while (true) {
                    jd8 jd8Var = r2.g;
                    jd8Var.h0(q2Var3, q2Var2);
                    if (jd8Var.c0(this, q2Var2, q2Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(q2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f29706a;
                            if ((obj2 != null) && (!(obj2 instanceof f2))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(q2Var3);
                        break;
                    }
                    long j4 = j3;
                    q2Var2 = this.c;
                    if (q2Var2 != q2Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f29706a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f29706a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof f2))) {
                return i(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + Separators.SP + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(Separators.COMMA);
                }
                strConcat = strConcat2.concat(Separators.SP);
            }
            if (z2) {
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
    public boolean isCancelled() {
        return this.f29706a instanceof e2;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f29706a;
        return (!(obj instanceof f2)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = r2.d;
        }
        if (!r2.g.b0(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        if (!r2.g.b0(this, null, new h2(th))) {
            return false;
        }
        g(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(ig00 ig00Var) {
        h2 h2Var;
        ig00Var.getClass();
        Object obj = this.f29706a;
        if (obj != null) {
            if (obj instanceof e2) {
                ig00Var.cancel(((e2) obj).f7062a);
            }
        } else if (ig00Var.isDone()) {
            if (r2.g.b0(this, null, j(ig00Var))) {
                g(this, false);
                return true;
            }
        } else {
            f2 f2Var = new f2(this, ig00Var);
            if (r2.g.b0(this, null, f2Var)) {
                try {
                    ig00Var.a(f2Var, ank.f1158a);
                    return true;
                } catch (Throwable th) {
                    try {
                        h2Var = new h2(th);
                    } catch (Error | Exception unused) {
                        h2Var = h2.b;
                    }
                    r2.g.b0(this, f2Var, h2Var);
                    return true;
                }
            }
            obj = this.f29706a;
            if (obj instanceof e2) {
                ig00Var.cancel(((e2) obj).f7062a);
            }
        }
        return false;
    }

    public final boolean p() {
        Object obj = this.f29706a;
        return (obj instanceof e2) && ((e2) obj).f7062a;
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f29706a;
            if (obj instanceof f2) {
                sb.append(", setFuture=[");
                ig00 ig00Var = ((f2) obj).b;
                try {
                    if (ig00Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(ig00Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strL = l();
                    if (strL == null || strL.isEmpty()) {
                        strL = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strL = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strL != null) {
                    hne.B(sb, ", info=[", strL, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                d(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        q2 q2Var = q2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f29706a;
            if ((obj2 != null) & (!(obj2 instanceof f2))) {
                return i(obj2);
            }
            q2 q2Var2 = this.c;
            if (q2Var2 != q2Var) {
                q2 q2Var3 = new q2();
                do {
                    jd8 jd8Var = r2.g;
                    jd8Var.h0(q2Var3, q2Var2);
                    if (jd8Var.c0(this, q2Var2, q2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f29706a;
                            } else {
                                b(q2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f2))));
                        return i(obj);
                    }
                    q2Var2 = this.c;
                } while (q2Var2 != q2Var);
            }
            Object obj3 = this.f29706a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
