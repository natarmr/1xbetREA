package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eyj0 extends lm40 implements ehl, fe60 {
    public ugg0 o;
    public kjj0 p;
    public oil q;

    @Override // a.fe60
    public final void R() {
        this.q = null;
        vfc.J(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eyj0)) {
            return false;
        }
        eyj0 eyj0Var = (eyj0) obj;
        return Intrinsics.d(this.o, eyj0Var.o) && Intrinsics.d(this.p, eyj0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + (this.o.hashCode() * 31);
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        oil oilVar;
        oil oilVar2 = this.q;
        if (oilVar2 == null) {
            ehf0 ehf0VarA = vcc.a0(this).getGraphicsContext().a();
            ugg0 ugg0Var = this.o;
            kjj0 kjj0Var = this.p;
            ehf0VarA.getClass();
            oil oilVar3 = new oil(ugg0Var, kjj0Var, ehf0VarA);
            this.q = oilVar3;
            oilVar = oilVar3;
        } else {
            oilVar = oilVar2;
        }
        oilVar.e(g7zVar, g7zVar.f10839a.d(), 1.0f, null);
        g7zVar.a();
    }
}
