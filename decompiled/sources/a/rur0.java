package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31140a;
    public final String b;
    public final boolean c;
    public final String d;

    public rur0(long j, String str, String str2, boolean z) {
        this.f31140a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rur0)) {
            return false;
        }
        rur0 rur0Var = (rur0) obj;
        return this.f31140a == rur0Var.f31140a && this.b.equals(rur0Var.b) && this.c == rur0Var.c && this.d.equals(rur0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Long.hashCode(this.f31140a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31140a, "TotoTaxStatusModel(profileId=", ", language=", this.b);
        hne.u(", taxEnabled=", ", infoMessage=", this.d, sbO, this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
