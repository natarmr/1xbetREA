package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class oub0 extends fot0 {
    public static final mub0 y = new mub0();
    public static final ScheduledExecutorService z = j120.T();
    public nub0 r;
    public Executor s;
    public tii0 t;
    public o3x u;
    public cmn0 v;
    public pmn0 w;
    public uii0 x;

    @Override // a.fot0
    public final void A() {
        G();
    }

    @Override // a.fot0
    public final void C(Rect rect) {
        this.l = rect;
        s0a s0aVarD = d();
        cmn0 cmn0Var = this.v;
        if (s0aVarD == null || cmn0Var == null) {
            return;
        }
        ofm0.w(new vmd0(cmn0Var, i(s0aVarD, p(s0aVarD)), ((Integer) ((w0x) this.i).e(w0x.m0, -1)).intValue()));
    }

    public final void G() {
        uii0 uii0Var = this.x;
        if (uii0Var != null) {
            uii0Var.b();
            this.x = null;
        }
        o3x o3xVar = this.u;
        if (o3xVar != null) {
            o3xVar.a();
            this.u = null;
        }
        cmn0 cmn0Var = this.v;
        if (cmn0Var != null) {
            cmn0Var.b();
            this.v = null;
        }
        pmn0 pmn0Var = this.w;
        if (pmn0Var != null) {
            synchronized (pmn0Var.f27245a) {
                pmn0Var.m = null;
                pmn0Var.n = null;
            }
        }
        this.w = null;
    }

    public final void H(nub0 nub0Var) {
        ofm0.m();
        if (nub0Var == null) {
            this.r = null;
            this.e = 2;
            s();
            return;
        }
        this.r = nub0Var;
        this.s = z;
        if (c() != null) {
            I((pub0) this.i, this.j);
            r();
        }
        this.e = 1;
        s();
    }

    public final void I(pub0 pub0Var, h55 h55Var) {
        ofm0.m();
        s0a s0aVarD = d();
        Objects.requireNonNull(s0aVarD);
        G();
        byte b = 1;
        z1x.y(null, this.v == null);
        Matrix matrix = this.m;
        boolean zQ = s0aVarD.q();
        Size size = h55Var.f12463a;
        Rect rect = this.l;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int i = i(s0aVarD, p(s0aVarD));
        w0x w0xVar = (w0x) this.i;
        u15 u15Var = w0x.m0;
        cmn0 cmn0Var = new cmn0(1, 34, h55Var, matrix, zQ, rect, i, ((Integer) w0xVar.e(u15Var, -1)).intValue(), s0aVarD.q() && p(s0aVarD));
        this.v = cmn0Var;
        wss wssVar = new wss(this, (byte) 21);
        ofm0.m();
        cmn0Var.a();
        cmn0Var.m.add(wssVar);
        pmn0 pmn0VarC = this.v.c(s0aVarD, true);
        this.w = pmn0VarC;
        this.u = pmn0VarC.k;
        if (this.r != null) {
            s0a s0aVarD2 = d();
            cmn0 cmn0Var2 = this.v;
            if (s0aVarD2 != null && cmn0Var2 != null) {
                ofm0.w(new vmd0(cmn0Var2, i(s0aVarD2, p(s0aVarD2)), ((Integer) ((w0x) this.i).e(u15Var, -1)).intValue()));
            }
            nub0 nub0Var = this.r;
            nub0Var.getClass();
            pmn0 pmn0Var = this.w;
            pmn0Var.getClass();
            this.s.execute(new oh60(nub0Var, pmn0Var, (byte) 7));
        }
        tii0 tii0VarD = tii0.d(pub0Var, h55Var.f12463a);
        ucs0 ucs0Var = tii0VarD.b;
        tii0VarD.h = h55Var.d;
        a(tii0VarD, h55Var);
        int iQ = pub0Var.q();
        if (iQ != 0 && iQ != 0) {
            ((wy40) ucs0Var.d).y(fpt0.O0, Integer.valueOf(iQ));
        }
        drd drdVar = h55Var.f;
        if (drdVar != null) {
            ucs0Var.g(drdVar);
        }
        if (this.r != null) {
            tii0VarD.b(this.u, h55Var.c, ((Integer) ((w0x) this.i).e(w0x.n0, -1)).intValue());
        }
        uii0 uii0Var = this.x;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new izw(this, b));
        this.x = uii0Var2;
        tii0VarD.f = uii0Var2;
        this.t = tii0VarD;
        Object[] objArr = {tii0VarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // a.fot0
    public final fpt0 g(boolean z2, ipt0 ipt0Var) {
        y.getClass();
        pub0 pub0Var = mub0.f22407a;
        drd drdVarA = ipt0Var.a(pub0Var.v(), 1);
        if (z2) {
            drdVarA = drd.r(drdVarA, pub0Var);
        }
        if (drdVarA == null) {
            return null;
        }
        return new pub0(b780.j(((gyw) n(drdVarA)).b));
    }

    @Override // a.fot0
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // a.fot0
    public final ept0 n(drd drdVar) {
        return new gyw(wy40.p(drdVar), (byte) 2);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // a.fot0
    public final fpt0 v(n0a n0aVar, ept0 ept0Var) {
        ept0Var.b().y(h0x.h0, 34);
        return ept0Var.e();
    }

    @Override // a.fot0
    public final h55 y(drd drdVar) {
        this.t.a(drdVar);
        Object[] objArr = {this.t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        qgd qgdVarB = this.j.b();
        qgdVarB.g = drdVar;
        return qgdVarB.i();
    }

    @Override // a.fot0
    public final h55 z(h55 h55Var, h55 h55Var2) {
        l8x.U("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + h55Var + ", secondaryStreamSpec " + h55Var2);
        I((pub0) this.i, h55Var);
        return h55Var;
    }
}
