package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21190a;
    public final String b;
    public final String c;

    public m4t0(String str, String str2, String str3) {
        this.f21190a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4t0)) {
            return false;
        }
        m4t0 m4t0Var = (m4t0) obj;
        return this.f21190a.equals(m4t0Var.f21190a) && this.b.equals(m4t0Var.b) && this.c.equals(m4t0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f21190a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OpponentModel(id=", this.f21190a, ", imageUrl=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
