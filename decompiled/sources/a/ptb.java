package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ptb extends ktb {
    public final a1g d;
    public final int e;

    public ptb(a1g a1gVar, int i, CoroutineContext coroutineContext, int i2, i99 i99Var) {
        super(coroutineContext, i2, i99Var);
        this.d = a1gVar;
        this.e = i;
    }

    @Override // a.ktb
    public final String f() {
        return "concurrency=" + this.e;
    }

    @Override // a.ktb
    public final Object h(hzb0 hzb0Var, yje yjeVar) throws Throwable {
        int i = hbi0.f12772a;
        this.d.c(new y38(yjeVar.getContext().get(gqw0.o1), (Object) new gbi0(this.e), (Object) hzb0Var, (Object) new mfi0(hzb0Var), (byte) 1), yjeVar);
        return wne.f39444a;
    }

    @Override // a.ktb
    public final ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return new ptb(this.d, this.e, coroutineContext, i, i99Var);
    }

    @Override // a.ktb
    public final htb l(vne vneVar) {
        Function2 jtbVar = new jtb(this, null, (byte) 0);
        i99 i99Var = i99.f14377a;
        yne yneVar = yne.f42936a;
        hzb0 hzb0Var = new hzb0(jne.b(vneVar, this.f18855a), vtb.d(this.b, i99Var, null, 4));
        hzb0Var.d0(yneVar, hzb0Var, jtbVar);
        return hzb0Var;
    }
}
