package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jj40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16605a;
    public final String b;
    public final String c;
    public final String d;
    public final nj40 e;
    public final oj40 f;

    public jj40(String str, String str2, String str3, String str4, nj40 nj40Var, oj40 oj40Var) {
        this.f16605a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = nj40Var;
        this.f = oj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj40)) {
            return false;
        }
        jj40 jj40Var = (jj40) obj;
        return this.f16605a.equals(jj40Var.f16605a) && this.b.equals(jj40Var.b) && this.c.equals(jj40Var.c) && this.d.equals(jj40Var.d) && this.e == jj40Var.e && this.f.equals(jj40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f16605a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MlbbPlayerModel(playerId=", this.f16605a, ", playerName=", this.b, ", playerImage=");
        f140.v(sbN, this.c, ", countryImage=", this.d, ", role=");
        sbN.append(this.e);
        sbN.append(", playerStat=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
