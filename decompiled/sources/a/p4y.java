package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/p4y;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p4y extends iw5 {
    public static final /* synthetic */ int q2 = 0;
    public lli k2;
    public wdk0 l2;
    public ii m2;
    public lgn0 n2;
    public ynb o2;
    public final a8z p2 = xbc.a0(this, sre0.f32672a.b(c5y.class), null, new o4y(this, (byte) 0), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1472204505);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, jel.f16379a, 0L, 44), (xdr) null, (ugd) null, u1c.M(-1426997368, new elm(this, (byte) 27), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n4y.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n4y n4yVar = (n4y) (ze3Var instanceof n4y ? ze3Var : null);
            if (n4yVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = n4yVar.f22918a;
                v88 v88Var = n4yVar.b;
                ii iiVar = n4yVar.c;
                duj dujVar = n4yVar.d;
                wdk0 wdk0Var = n4yVar.g;
                wsf0 wsf0Var = n4yVar.e;
                rou rouVar = n4yVar.h;
                lgn0 lgn0Var = n4yVar.j;
                peg0 peg0Var = n4yVar.f;
                ctf0 ctf0Var = n4yVar.i;
                csr0 csr0Var = n4yVar.k;
                knf0 knf0Var = n4yVar.l;
                gii0 gii0Var = n4yVar.m;
                btt0 btt0Var = n4yVar.o;
                hqr0 hqr0Var = n4yVar.p;
                wyu wyuVar = n4yVar.n;
                tgk tgkVar = n4yVar.q;
                m1e m1eVar = n4yVar.r;
                iiVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                csr0Var.getClass();
                hqr0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                tgkVar.getClass();
                wyuVar.getClass();
                m1eVar.getClass();
                this.k2 = (lli) new iji(cadVar, peg0Var, wsf0Var, iiVar, v88Var, dujVar, i1w0VarF, wdk0Var, rouVar, ctf0Var, lgn0Var, csr0Var, hqr0Var, knf0Var, gii0Var, btt0Var, tgkVar, wyuVar, m1eVar, (byte) 2).q.get();
                this.l2 = wdk0Var;
                this.m2 = iiVar;
                this.n2 = lgn0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.o2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(n4y.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }

    @Override // a.iw5
    public final void M0() {
    }
}
