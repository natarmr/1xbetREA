package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ji50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16560a;
    public final String b;
    public final String c;
    public final String d;
    public final cj50 e;

    public ji50(long j, String str, String str2, String str3, cj50 cj50Var) {
        this.f16560a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cj50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji50)) {
            return false;
        }
        ji50 ji50Var = (ji50) obj;
        return this.f16560a == ji50Var.f16560a && this.b.equals(ji50Var.b) && this.c.equals(ji50Var.c) && this.d.equals(ji50Var.d) && this.e == ji50Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f16560a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16560a, "NearestGameDetailsTableStatItemModel(id=", ", teamOneScore=", this.b);
        f140.v(sbO, ", teamTwoScore=", this.c, ", name=", this.d);
        sbO.append(", type=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
