package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/qm80;", "La/um40;", "La/rm80;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class qm80 extends um40 {
    public final pm80 b;
    public final u12 c;
    public final qge d;
    public final float e;
    public final a4d f;

    public qm80(pm80 pm80Var, u12 u12Var, qge qgeVar, float f, a4d a4dVar) {
        this.b = pm80Var;
        this.c = u12Var;
        this.d = qgeVar;
        this.e = f;
        this.f = a4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm80)) {
            return false;
        }
        qm80 qm80Var = (qm80) obj;
        return Intrinsics.d(this.b, qm80Var.b) && Intrinsics.d(this.c, qm80Var.c) && Intrinsics.d(this.d, qm80Var.d) && Float.compare(this.e, qm80Var.e) == 0 && Intrinsics.d(this.f, qm80Var.f);
    }

    @Override // a.um40
    public final lm40 f() {
        rm80 rm80Var = new rm80();
        rm80Var.o = this.b;
        rm80Var.p = true;
        rm80Var.q = this.c;
        rm80Var.r = this.d;
        rm80Var.s = this.e;
        rm80Var.t = this.f;
        return rm80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        rm80 rm80Var = (rm80) lm40Var;
        boolean z = rm80Var.p;
        pm80 pm80Var = this.b;
        boolean z2 = (z && h7k0.b(rm80Var.o.i(), pm80Var.i())) ? false : true;
        rm80Var.o = pm80Var;
        rm80Var.p = true;
        rm80Var.q = this.c;
        rm80Var.r = this.d;
        rm80Var.s = this.e;
        rm80Var.t = this.f;
        if (z2) {
            n7x.I(rm80Var);
        }
        vfc.J(rm80Var);
    }

    public final int hashCode() {
        int iA = defpackage.c.a((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.b.hashCode() * 31, 31, true)) * 31)) * 31, this.e, 31);
        a4d a4dVar = this.f;
        return iA + (a4dVar == null ? 0 : a4dVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=true, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + Separators.RPAREN;
    }
}
