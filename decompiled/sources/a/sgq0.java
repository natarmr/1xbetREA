package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sgq0 implements khq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32175a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final rqm g;
    public final rqm h;
    public final rqm i;
    public final String j;

    /* JADX WARN: Multi-variable type inference failed */
    public sgq0(int i, String str, String str2, boolean z, boolean z2, boolean z3, rqm rqmVar, rqm rqmVar2, rqm rqmVar3) {
        this.f32175a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = rqmVar;
        this.h = rqmVar2;
        this.i = rqmVar3;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(Separators.SP);
        sb.append(z);
        sb.append(Separators.SP);
        sb.append(str2);
        this.j = axq.n(sb, Separators.SP, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgq0)) {
            return false;
        }
        sgq0 sgq0Var = (sgq0) obj;
        return this.f32175a == sgq0Var.f32175a && this.b.equals(sgq0Var.b) && this.c.equals(sgq0Var.c) && this.d == sgq0Var.d && this.e == sgq0Var.e && this.f == sgq0Var.f && this.g.equals(sgq0Var.g) && this.h.equals(sgq0Var.h) && this.i.equals(sgq0Var.i);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.j;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f32175a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f32175a, "TimeCustomFilterUiModel(id=", ", startDateText=", this.b, ", endDateText=");
        brm0.C(this.c, ", selected=", ", startDateTextIconVisible=", sbR, this.d);
        ua80.u(", endDateTextIconVisible=", ", containerCellStyle=", sbR, this.e, this.f);
        sbR.append(this.g);
        sbR.append(", startDateStyle=");
        sbR.append(this.h);
        sbR.append(", endDateStyle=");
        sbR.append(this.i);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
