package a;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class np10 extends lm40 implements t7v, ehl, qai0, fe60 {
    public zbk B;
    public qkx Z;
    public q99 f1;
    public vpj0 o;
    public a1i p;
    public yv90 w;
    public View x;
    public w6k y;
    public xv90 z;
    public float q = Float.NaN;
    public boolean r = true;
    public long s = 9205357640488583168L;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public boolean v = true;
    public final pz40 A = androidx.compose.runtime.e.d(null, m2a.v);
    public long Y = 9205357640488583168L;

    public np10(vpj0 vpj0Var, a1i a1iVar, yv90 yv90Var) {
        this.o = vpj0Var;
        this.p = a1iVar;
        this.w = yv90Var;
    }

    @Override // a.t7v
    public final void P(s460 s460Var) {
        ((hgk0) this.A).setValue(s460Var);
    }

    @Override // a.fe60
    public final void R() {
        c9x.B(this, new mp10(this, (byte) 0));
    }

    @Override // a.lm40
    public final void R0() {
        R();
        this.f1 = vtb.d(0, null, null, 7);
        qjj.W(N0(), null, yne.d, new e3p(this, null, (byte) 15), 1);
    }

    @Override // a.lm40
    public final void S0() {
        xv90 xv90Var = this.z;
        if (xv90Var != null) {
            ((zv90) xv90Var).b();
        }
        this.z = null;
    }

    public final long Z0() {
        zbk zbkVarB = this.B;
        if (zbkVarB == null) {
            zbkVarB = jgk0.b(new mp10(this, (byte) 2));
            this.B = zbkVarB;
        }
        return ((ne60) zbkVarB.getValue()).f23370a;
    }

    public final void a1() {
        xv90 xv90Var = this.z;
        if (xv90Var != null) {
            ((zv90) xv90Var).b();
        }
        View viewZ = this.x;
        if (viewZ == null) {
            viewZ = tdc.Z(this);
        }
        View view = viewZ;
        this.x = view;
        w6k w6kVar = this.y;
        if (w6kVar == null) {
            w6kVar = vcc.Z(this).z;
        }
        w6k w6kVar2 = w6kVar;
        this.y = w6kVar2;
        this.z = this.w.a(view, this.r, this.s, this.t, this.u, this.v, w6kVar2, this.q);
        c1();
    }

    public final void b1() {
        w6k w6kVar = this.y;
        if (w6kVar == null) {
            w6kVar = vcc.Z(this).z;
            this.y = w6kVar;
        }
        long j = ((ne60) this.o.invoke(w6kVar)).f23370a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & Z0()) == 9205357640488583168L) {
            this.Y = 9205357640488583168L;
            xv90 xv90Var = this.z;
            if (xv90Var != null) {
                ((zv90) xv90Var).b();
                return;
            }
            return;
        }
        this.Y = ne60.f(Z0(), j);
        if (this.z == null) {
            a1();
        }
        xv90 xv90Var2 = this.z;
        if (xv90Var2 != null) {
            xv90Var2.a(this.q, this.Y, 9205357640488583168L);
        }
        c1();
    }

    public final void c1() {
        w6k w6kVar;
        xv90 xv90Var = this.z;
        if (xv90Var == null || (w6kVar = this.y) == null) {
            return;
        }
        zv90 zv90Var = (zv90) xv90Var;
        long jC = zv90Var.c();
        qkx qkxVar = this.Z;
        if (qkxVar != null && jC == qkxVar.f28908a) {
            return;
        }
        a1i a1iVar = this.p;
        if (a1iVar != null) {
            a1iVar.invoke(new bdl(w6kVar.p(n2x.Q(zv90Var.c()))));
        }
        this.Z = new qkx(zv90Var.c());
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        g7zVar.a();
        q99 q99Var = this.f1;
        if (q99Var != null) {
            q99Var.f(Unit.f46060a);
        }
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        abi0Var.b(op10.f25618a, new mp10(this, (byte) 1));
    }
}
