package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public class a3h0 extends a2 implements xne {
    public final yje e;

    public a3h0(yje yjeVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.e = yjeVar;
    }

    @Override // a.pby
    public final boolean M() {
        return true;
    }

    @Override // a.xne
    public final xne getCallerFrame() {
        yje yjeVar = this.e;
        if (yjeVar instanceof xne) {
            return (xne) yjeVar;
        }
        return null;
    }

    @Override // a.pby
    public void o(Object obj) throws mvk {
        ovk.a(pnx.b(this.e), qzb.S0(obj));
    }

    @Override // a.pby
    public void p(Object obj) {
        this.e.resumeWith(qzb.S0(obj));
    }

    public void e0() {
    }
}
