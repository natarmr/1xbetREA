package a;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hzb0 extends a2 implements htb, jbi0 {
    public final q99 e;

    public hzb0(CoroutineContext coroutineContext, q99 q99Var) {
        super(coroutineContext, true);
        this.e = q99Var;
    }

    @Override // a.htb
    public final Object a(bnn0 bnn0Var) {
        q99 q99Var = this.e;
        q99Var.getClass();
        Object objG = q99.G(q99Var, bnn0Var);
        wne wneVar = wne.f39444a;
        return objG;
    }

    @Override // a.a2
    public final void b0(Throwable th, boolean z) {
        if (this.e.e(th, false) || z) {
            return;
        }
        u1c.H(th, this.d);
    }

    @Override // a.jbi0
    public final void c(Function1 function1) {
        this.e.c(function1);
    }

    @Override // a.a2
    public final void c0(Object obj) {
        this.e.d(null);
    }

    @Override // a.pby, a.bby, a.htb
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new cby(u(), null, this);
        }
        s(cancellationException);
    }

    public final boolean e0(Throwable th) {
        return this.e.e(th, false);
    }

    @Override // a.jbi0
    public final Object f(Object obj) {
        return this.e.f(obj);
    }

    @Override // a.htb
    public final Object g(yje yjeVar) {
        return this.e.g(yjeVar);
    }

    @Override // a.htb
    public final i1i0 i() {
        return this.e.i();
    }

    @Override // a.htb
    public final j99 iterator() {
        q99 q99Var = this.e;
        q99Var.getClass();
        return new j99(q99Var);
    }

    @Override // a.htb
    public final Object j() {
        return this.e.j();
    }

    @Override // a.jbi0
    public final Object m(yje yjeVar, Object obj) {
        return this.e.m(yjeVar, obj);
    }

    @Override // a.pby
    public final void s(Throwable th) {
        CancellationException cancellationExceptionY = pby.Y(this, th);
        this.e.e(cancellationExceptionY, true);
        r(cancellationExceptionY);
    }
}
