package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g280 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10551a;
    public final String b;
    public final String c;

    public g280(int i, String str, String str2) {
        this.f10551a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g280)) {
            return false;
        }
        g280 g280Var = (g280) obj;
        return this.f10551a == g280Var.f10551a && this.b.equals(g280Var.b) && this.c.equals(g280Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f10551a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f10551a, "OpponentModel(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
