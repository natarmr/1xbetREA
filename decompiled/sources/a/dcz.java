package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dcz extends lm40 implements qai0 {
    public Function0 o;
    public xbz p;
    public ma80 q;
    public boolean r;
    public boolean s;
    public t9h0 t;
    public final bcz u = new bcz(this, (byte) 0);
    public bcz v;

    public dcz(Function0 function0, xbz xbzVar, ma80 ma80Var, boolean z, boolean z2) {
        this.o = function0;
        this.p = xbzVar;
        this.q = ma80Var;
        this.r = z;
        this.s = z2;
        Z0();
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    public final void Z0() {
        this.t = new t9h0(new ccz(this, (byte) 0), new ccz(this, (byte) 1), this.s);
        this.v = this.r ? new bcz(this, (byte) 1) : null;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        iiy[] iiyVarArr;
        yai0.j(abi0Var);
        abi0Var.b(xai0.P, this.u);
        ma80 ma80Var = this.q;
        ma80 ma80Var2 = ma80.f21447a;
        t9h0 t9h0Var = this.t;
        if (ma80Var == ma80Var2) {
            if (t9h0Var == null) {
                Intrinsics.h("scrollAxisRange");
                throw null;
            }
            zai0 zai0Var = xai0.w;
            iiyVarArr = yai0.f42300a;
            iiy iiyVar = iiyVarArr[13];
            zai0Var.getClass();
            abi0Var.b(zai0Var, t9h0Var);
        } else {
            if (t9h0Var == null) {
                Intrinsics.h("scrollAxisRange");
                throw null;
            }
            zai0 zai0Var2 = xai0.v;
            iiyVarArr = yai0.f42300a;
            iiy iiyVar2 = iiyVarArr[12];
            zai0Var2.getClass();
            abi0Var.b(zai0Var2, t9h0Var);
        }
        bcz bczVar = this.v;
        if (bczVar != null) {
            abi0Var.b(mai0.f, new m6(null, bczVar));
        }
        abi0Var.b(mai0.C, new m6(null, new rai0(new ccz(this, (byte) 2), (byte) 1)));
        m3d m3dVarC = this.p.c();
        zai0 zai0Var3 = xai0.f;
        iiy iiyVar3 = iiyVarArr[24];
        zai0Var3.getClass();
        abi0Var.b(zai0Var3, m3dVarC);
    }
}
