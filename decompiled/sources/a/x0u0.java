package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40090a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public x0u0(int i, String str, String str2, String str3, String str4) {
        this.f40090a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0u0)) {
            return false;
        }
        x0u0 x0u0Var = (x0u0) obj;
        return this.f40090a == x0u0Var.f40090a && this.b.equals(x0u0Var.b) && this.c.equals(x0u0Var.c) && this.d.equals(x0u0Var.d) && this.e.equals(x0u0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f40090a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f40090a, "ValorantStatisticMatchesPlayerModel(id=", ", name=", this.b, ", image=");
        f140.v(sbR, this.c, ", countryImage=", this.d, ", realName=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }
}
