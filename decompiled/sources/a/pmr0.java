package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27251a;
    public final String b;
    public final ulr0 c;
    public final boolean d;
    public final int e;

    public pmr0(int i, String str, ulr0 ulr0Var, boolean z, int i2) {
        this.f27251a = i;
        this.b = str;
        this.c = ulr0Var;
        this.d = z;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmr0)) {
            return false;
        }
        pmr0 pmr0Var = (pmr0) obj;
        return this.f27251a == pmr0Var.f27251a && this.b.equals(pmr0Var.b) && this.c == pmr0Var.c && this.d == pmr0Var.d && this.e == pmr0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e((this.c.hashCode() + ua80.b(Integer.hashCode(this.f27251a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f27251a, "TotoBetTypeUiModel(id=", ", name=", this.b, ", type=");
        sbR.append(this.c);
        sbR.append(", selected=");
        sbR.append(this.d);
        sbR.append(", iconRes=");
        return rz4.j(this.e, Separators.RPAREN, sbR);
    }
}
