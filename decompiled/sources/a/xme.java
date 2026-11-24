package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/xme;", "La/um40;", "La/ane;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class xme extends um40 {
    public final nls0 b;
    public final a8q0 c;
    public final djz d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final qe60 h;
    public final k7q0 i;
    public final k3x j;
    public final cqq k;

    public xme(nls0 nls0Var, a8q0 a8q0Var, djz djzVar, boolean z, boolean z2, boolean z3, qe60 qe60Var, k7q0 k7q0Var, k3x k3xVar, cqq cqqVar) {
        this.b = nls0Var;
        this.c = a8q0Var;
        this.d = djzVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = qe60Var;
        this.i = k7q0Var;
        this.j = k3xVar;
        this.k = cqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xme) {
            xme xmeVar = (xme) obj;
            if (this.b.equals(xmeVar.b) && Intrinsics.d(this.c, xmeVar.c) && this.d == xmeVar.d && this.e == xmeVar.e && this.f == xmeVar.f && this.g == xmeVar.g && this.h.equals(xmeVar.h) && this.i == xmeVar.i && Intrinsics.d(this.j, xmeVar.j) && Intrinsics.d(this.k, xmeVar.k)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        ane aneVar = new ane();
        aneVar.q = this.b;
        aneVar.r = this.c;
        aneVar.s = this.d;
        aneVar.t = this.e;
        aneVar.u = this.f;
        aneVar.v = this.g;
        aneVar.w = this.h;
        k7q0 k7q0Var = this.i;
        aneVar.x = k7q0Var;
        aneVar.y = this.j;
        aneVar.z = this.k;
        k7q0Var.g = new yme(aneVar, (byte) 4);
        return aneVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ane aneVar = (ane) lm40Var;
        boolean z = aneVar.u;
        byte b = 0;
        boolean z2 = z && !aneVar.t;
        boolean z3 = aneVar.v;
        k3x k3xVar = aneVar.y;
        k7q0 k7q0Var = aneVar.x;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = z5 && !z4;
        aneVar.q = this.b;
        a8q0 a8q0Var = this.c;
        aneVar.r = a8q0Var;
        aneVar.s = this.d;
        aneVar.t = z4;
        aneVar.u = z5;
        aneVar.w = this.h;
        k7q0 k7q0Var2 = this.i;
        aneVar.x = k7q0Var2;
        k3x k3xVar2 = this.j;
        aneVar.y = k3xVar2;
        aneVar.z = this.k;
        if (z5 != z || z6 != z2 || !Intrinsics.d(k3xVar2, k3xVar) || this.g != z3 || !o9q0.c(a8q0Var.b)) {
            s0x.S(aneVar);
        }
        if (k7q0Var2 != k7q0Var) {
            k7q0Var2.g = new yme(aneVar, b);
        }
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", readOnly=");
        sb.append(this.e);
        sb.append(", enabled=");
        ua80.u(", isPassword=", ", offsetMapping=", sb, this.f, this.g);
        sb.append(this.h);
        sb.append(", manager=");
        sb.append(this.i);
        sb.append(", imeOptions=");
        sb.append(this.j);
        sb.append(", focusRequester=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
