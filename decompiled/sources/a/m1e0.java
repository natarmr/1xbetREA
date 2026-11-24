package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21004a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public m1e0(String str, String str2, String str3, String str4, String str5) {
        this.f21004a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1e0)) {
            return false;
        }
        m1e0 m1e0Var = (m1e0) obj;
        return this.f21004a.equals(m1e0Var.f21004a) && this.b.equals(m1e0Var.b) && this.c.equals(m1e0Var.c) && this.d.equals(m1e0Var.d) && this.e.equals(m1e0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f21004a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RankCardUiModel(rating=", this.f21004a, ", points=", this.b, ", winLose=");
        f140.v(sbN, this.c, ", titles=", this.d, ", prizeMoney=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
