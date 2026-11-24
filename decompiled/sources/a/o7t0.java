package a;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class o7t0 extends a3h0 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public o7t0(yje yjeVar, CoroutineContext coroutineContext) {
        p7t0 p7t0Var = p7t0.f26524a;
        super(yjeVar, coroutineContext.get(p7t0Var) == null ? coroutineContext.plus(p7t0Var) : coroutineContext);
        this.f = new ThreadLocal();
        if (yjeVar.getContext().get(kotlin.coroutines.d.d1) instanceof lne) {
            return;
        }
        Object objC = ecq0.c(coroutineContext, null);
        ecq0.a(coroutineContext, objC);
        h0(coroutineContext, objC);
    }

    @Override // a.a3h0
    public final void e0() {
        g0();
    }

    public final boolean f0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void g0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f.get();
            if (pair != null) {
                ecq0.a((CoroutineContext) pair.f46059a, pair.b);
            }
            this.f.remove();
        }
    }

    public final void h0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new Pair(coroutineContext, obj));
    }

    @Override // a.a3h0, a.pby
    public final void p(Object obj) {
        g0();
        Object objS0 = qzb.S0(obj);
        yje yjeVar = this.e;
        CoroutineContext context = yjeVar.getContext();
        Object objC = ecq0.c(context, null);
        o7t0 o7t0VarC = objC != ecq0.f7579a ? jne.c(yjeVar, context, objC) : null;
        try {
            yjeVar.resumeWith(objS0);
        } finally {
            if (o7t0VarC == null || o7t0VarC.f0()) {
                ecq0.a(context, objC);
            }
        }
    }
}
