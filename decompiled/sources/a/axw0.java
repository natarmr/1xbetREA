package a;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class axw0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1642a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ fxw0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axw0(fxw0 fxw0Var, Callable callable, boolean z) {
        super(callable);
        this.d = fxw0Var;
        long andIncrement = fxw0.l.getAndIncrement();
        this.f1642a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            uuw0 uuw0Var = ((kxw0) fxw0Var.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        axw0 axw0Var = (axw0) obj;
        boolean z = axw0Var.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = axw0Var.f1642a;
        long j2 = this.f1642a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        uuw0 uuw0Var = ((kxw0) this.d.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.h.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        uuw0 uuw0Var = ((kxw0) this.d.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.g.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axw0(fxw0 fxw0Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = fxw0Var;
        long andIncrement = fxw0.l.getAndIncrement();
        this.f1642a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            uuw0 uuw0Var = ((kxw0) fxw0Var.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Tasks index overflow");
        }
    }
}
