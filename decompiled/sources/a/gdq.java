package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gdq implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11114a;
    public final String b;
    public final String c;

    public gdq(int i, String str, String str2) {
        opn opnVar = opn.f25650a;
        this.f11114a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdq)) {
            return false;
        }
        gdq gdqVar = (gdq) obj;
        if (this.f11114a != gdqVar.f11114a || !this.b.equals(gdqVar.b)) {
            return false;
        }
        opn opnVar = opn.f25650a;
        return this.c.equals(gdqVar.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((opn.c.hashCode() + ua80.b(Integer.hashCode(this.f11114a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        opn opnVar = opn.c;
        StringBuilder sbR = vqd.r(this.f11114a, "FindCouponParamsUiModel(id=", ", name=", this.b, ", containerTypeUiModel=");
        sbR.append(opnVar);
        sbR.append(", svgSportUrl=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
