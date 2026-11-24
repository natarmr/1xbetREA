package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"La/h1y;", "La/iw5;", "<init>", "()V", "La/t1y;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h1y extends iw5 {
    public static final /* synthetic */ int q2 = 0;
    public hji k2;
    public wdk0 l2;
    public ii m2;
    public lgn0 n2;
    public ynb o2;
    public final a8z p2 = xbc.a0(this, sre0.f32672a.b(a2y.class), null, new f1y(this, (byte) 0), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1893564156);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, null, 0L, 60), (xdr) null, (ugd) null, u1c.M(112830125, new elm(this, (byte) 25), fetVar), 14);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e1y.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e1y e1yVar = (e1y) (ze3Var instanceof e1y ? ze3Var : null);
            if (e1yVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = e1yVar.f7060a;
                v88 v88Var = e1yVar.b;
                ii iiVar = e1yVar.c;
                duj dujVar = e1yVar.d;
                wdk0 wdk0Var = e1yVar.g;
                wsf0 wsf0Var = e1yVar.e;
                rou rouVar = e1yVar.h;
                lgn0 lgn0Var = e1yVar.j;
                peg0 peg0Var = e1yVar.f;
                ctf0 ctf0Var = e1yVar.i;
                csr0 csr0Var = e1yVar.k;
                knf0 knf0Var = e1yVar.l;
                gii0 gii0Var = e1yVar.m;
                btt0 btt0Var = e1yVar.o;
                hqr0 hqr0Var = e1yVar.p;
                wyu wyuVar = e1yVar.n;
                tgk tgkVar = e1yVar.q;
                m1e m1eVar = e1yVar.r;
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
                this.k2 = (hji) new iji(cadVar, peg0Var, wsf0Var, iiVar, v88Var, dujVar, i1w0VarF, wdk0Var, rouVar, ctf0Var, lgn0Var, csr0Var, hqr0Var, knf0Var, gii0Var, btt0Var, tgkVar, wyuVar, m1eVar, (byte) 0).q.get();
                this.l2 = wdk0Var;
                this.m2 = iiVar;
                this.n2 = lgn0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.o2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(e1y.class, "Cannot create dependency "));
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
