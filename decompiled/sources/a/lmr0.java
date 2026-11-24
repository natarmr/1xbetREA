package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20312a;
    public final String b;
    public final ulr0 c;
    public final boolean d;

    public lmr0(int i, String str, ulr0 ulr0Var, boolean z) {
        this.f20312a = i;
        this.b = str;
        this.c = ulr0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmr0)) {
            return false;
        }
        lmr0 lmr0Var = (lmr0) obj;
        return this.f20312a == lmr0Var.f20312a && this.b.equals(lmr0Var.b) && this.c == lmr0Var.c && this.d == lmr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(Integer.hashCode(this.f20312a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f20312a, "TotoBetTypeModel(id=", ", name=", this.b, ", type=");
        sbR.append(this.c);
        sbR.append(", selected=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
