package a;

import android.os.Build;
import android.view.autofill.AutofillValue;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ane extends f3k implements qai0 {
    public nls0 q;
    public a8q0 r;
    public djz s;
    public boolean t;
    public boolean u;
    public boolean v;
    public qe60 w;
    public k7q0 x;
    public k3x y;
    public cqq z;

    public static void c1(djz djzVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        r8q0 r8q0Var = djzVar.e;
        ome omeVar = djzVar.v;
        if (r8q0Var == null) {
            int length = str.length();
            omeVar.invoke(new a8q0(str, s7n0.e(length, length), 4));
        } else {
            a8q0 a8q0VarB = djzVar.d.b(q3d.j(new j4k(), new l8d(str, 1)));
            r8q0Var.a(null, a8q0VarB);
            omeVar.invoke(a8q0VarB);
        }
    }

    @Override // a.qai0
    public final boolean J0() {
        return true;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        boolean z = this.v;
        j83 j83Var = this.r.f440a;
        iiy[] iiyVarArr = yai0.f42300a;
        zai0 zai0Var = xai0.F;
        iiy[] iiyVarArr2 = yai0.f42300a;
        iiy iiyVar = iiyVarArr2[18];
        zai0Var.getClass();
        abi0Var.b(zai0Var, j83Var);
        j83 j83Var2 = this.q.f23743a;
        zai0 zai0Var2 = xai0.G;
        iiy iiyVar2 = iiyVarArr2[19];
        zai0Var2.getClass();
        abi0Var.b(zai0Var2, j83Var2);
        long j = this.r.b;
        zai0 zai0Var3 = xai0.H;
        iiy iiyVar3 = iiyVarArr2[20];
        o9q0 o9q0Var = new o9q0(j);
        zai0Var3.getClass();
        abi0Var.b(zai0Var3, o9q0Var);
        jy2 jy2Var = rv00.i;
        zai0 zai0Var4 = xai0.s;
        iiy iiyVar4 = iiyVarArr2[9];
        zai0Var4.getClass();
        abi0Var.b(zai0Var4, jy2Var);
        ez2 ez2Var = Build.VERSION.SDK_INT >= 26 ? new ez2(AutofillValue.forText(zgc.T(this.r.f440a))) : null;
        if (ez2Var != null) {
            zai0 zai0Var5 = xai0.t;
            iiy iiyVar5 = iiyVarArr2[10];
            zai0Var5.getClass();
            abi0Var.b(zai0Var5, ez2Var);
        }
        boolean z2 = false;
        abi0Var.b(mai0.h, new m6(null, new zme(this, (byte) 0)));
        int i = this.y.d;
        if (i == 6) {
            oie.f25306a.getClass();
            yai0.c(abi0Var, mie.d);
        } else if (i == 7 || i == 8) {
            oie.f25306a.getClass();
            yai0.c(abi0Var, mie.c);
        } else if (i == 4) {
            oie.f25306a.getClass();
            yai0.c(abi0Var, mie.k);
        }
        if (!this.u) {
            abi0Var.b(xai0.j, Unit.f46060a);
        }
        if (z) {
            abi0Var.b(xai0.N, Unit.f46060a);
        }
        if (this.u && !this.t) {
            z2 = true;
        }
        zai0 zai0Var6 = xai0.Q;
        iiy iiyVar6 = iiyVarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z2);
        zai0Var6.getClass();
        abi0Var.b(zai0Var6, boolValueOf);
        yai0.a(abi0Var, new zme(this, (byte) 1));
        if (z2) {
            abi0Var.b(mai0.k, new m6(null, new zme(this, (byte) 2)));
            abi0Var.b(mai0.o, new m6(null, new zme(this, abi0Var)));
        }
        abi0Var.b(mai0.j, new m6(null, new sd8(this, (byte) 16)));
        int i2 = this.y.e;
        yme ymeVar = new yme(this, (byte) 6);
        abi0Var.b(xai0.J, new j3x(i2));
        abi0Var.b(mai0.p, new m6(null, ymeVar));
        abi0Var.b(mai0.b, new m6(null, new yme(this, (byte) 7)));
        abi0Var.b(mai0.c, new m6(null, new yme(this, (byte) 1)));
        if (!o9q0.c(this.r.b) && !z) {
            abi0Var.b(mai0.q, new m6(null, new yme(this, (byte) 2)));
            if (this.u && !this.t) {
                abi0Var.b(mai0.r, new m6(null, new yme(this, (byte) 3)));
            }
        }
        if (!this.u || this.t) {
            return;
        }
        abi0Var.b(mai0.s, new m6(null, new yme(this, (byte) 5)));
    }
}
