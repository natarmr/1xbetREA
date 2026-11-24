package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"La/o5y;", "La/iw5;", "<init>", "()V", "La/y5y;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o5y extends iw5 {
    public static final /* synthetic */ int q2 = 0;
    public kji k2;
    public wdk0 l2;
    public ii m2;
    public lgn0 n2;
    public ynb o2;
    public final a8z p2 = xbc.a0(this, sre0.f32672a.b(e6y.class), null, new n5y(this, (byte) 0), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-450699254);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, null, 0L, 60), (xdr) null, (ugd) null, u1c.M(1955848059, new elm(this, (byte) 28), fetVar), 14);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l5y.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l5y l5yVar = (l5y) (ze3Var instanceof l5y ? ze3Var : null);
            if (l5yVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = l5yVar.f19482a;
                v88 v88Var = l5yVar.b;
                ii iiVar = l5yVar.c;
                duj dujVar = l5yVar.d;
                wdk0 wdk0Var = l5yVar.g;
                wsf0 wsf0Var = l5yVar.e;
                rou rouVar = l5yVar.h;
                lgn0 lgn0Var = l5yVar.j;
                peg0 peg0Var = l5yVar.f;
                ctf0 ctf0Var = l5yVar.i;
                csr0 csr0Var = l5yVar.k;
                knf0 knf0Var = l5yVar.l;
                gii0 gii0Var = l5yVar.m;
                btt0 btt0Var = l5yVar.o;
                hqr0 hqr0Var = l5yVar.p;
                wyu wyuVar = l5yVar.n;
                tgk tgkVar = l5yVar.q;
                m1e m1eVar = l5yVar.r;
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
                this.k2 = (kji) ((n5d0) new v7i(cadVar, peg0Var, wsf0Var, iiVar, v88Var, dujVar, i1w0VarF, wdk0Var, rouVar, ctf0Var, lgn0Var, csr0Var, hqr0Var, knf0Var, gii0Var, btt0Var, tgkVar, m1eVar).o).get();
                this.l2 = wdk0Var;
                this.m2 = iiVar;
                this.n2 = lgn0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.o2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(l5y.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
