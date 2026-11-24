package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class oum0 extends f3k implements gpa0, lpq, eqq {
    public Function0 q;
    public boolean r;
    public final jnn0 s;

    public oum0(Function0 function0) {
        this.q = function0;
        zy2 zy2Var = new zy2(this, (byte) 7);
        woa0 woa0Var = fnn0.f9847a;
        jnn0 jnn0Var = new jnn0(null, null, zy2Var);
        Z0(jnn0Var);
        this.s = jnn0Var;
    }

    @Override // a.lpq
    public final void L(iqq iqqVar) {
        this.r = iqqVar.b();
    }

    @Override // a.gpa0
    public final long d0() {
        cdl cdlVar = fre0.n;
        w6k w6kVar = vcc.Z(this).z;
        cdlVar.getClass();
        int i = dwr0.b;
        return egm0.k(w6kVar.T(10.0f), w6kVar.T(40.0f), w6kVar.T(10.0f), w6kVar.T(40.0f));
    }

    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        this.s.h(woa0Var, xoa0Var, j);
    }

    @Override // a.gpa0
    public final void n0() {
        this.s.n0();
    }
}
