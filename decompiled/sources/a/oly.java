package a;

import android.gov.nist.core.Separators;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/oly;", "La/um40;", "La/nly;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class oly extends um40 {
    public final boolean b;
    public final ghn c;
    public final float d;
    public final l7m0 e;

    public oly(boolean z, ghn ghnVar, float f, l7m0 l7m0Var) {
        this.b = z;
        this.c = ghnVar;
        this.d = f;
        this.e = l7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oly)) {
            return false;
        }
        oly olyVar = (oly) obj;
        return this.b == olyVar.b && this.c.equals(olyVar.c) && Float.compare(this.d, olyVar.d) == 0 && Intrinsics.d(this.e, olyVar.e);
    }

    @Override // a.um40
    public final lm40 f() {
        return new nly(this.b, this.c, this.d, this.e);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        agd agdVarB1;
        Window window;
        nly nlyVar = (nly) lm40Var;
        nlyVar.getClass();
        boolean z = nlyVar.o;
        boolean z2 = this.b;
        boolean z3 = z != z2;
        l7m0 l7m0Var = nlyVar.r;
        l7m0 l7m0Var2 = this.e;
        boolean z4 = l7m0Var != l7m0Var2;
        nlyVar.o = z2;
        nlyVar.p = this.c;
        nlyVar.q = this.d;
        nlyVar.r = l7m0Var2;
        if (z3) {
            if (z2 && (agdVarB1 = nlyVar.b1()) != null && (window = agdVarB1.getWindow()) != null) {
                window.setSoftInputMode(nlyVar.u);
            }
            nlyVar.Z0();
        }
        if (z4 && nlyVar.n) {
            nlyVar.d1();
            nlyVar.c1();
        }
    }

    public final int hashCode() {
        int iA = defpackage.c.a(twn.a(300, (this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31, 31), this.d, 31);
        l7m0 l7m0Var = this.e;
        return iA + (l7m0Var == null ? 0 : l7m0Var.hashCode());
    }

    public final String toString() {
        return "KeyboardAdjustmentNodeElement(shouldChangeSoftInputMode=" + this.b + ", easing=" + this.c + ", durationMillis=300, additionalOffsetPx=" + this.d + ", keyboardState=" + this.e + Separators.RPAREN;
    }
}
