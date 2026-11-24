package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xh50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40871a;
    public final boolean b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    public xh50(long j, String str, String str2, String str3, String str4, boolean z) {
        this.f40871a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh50)) {
            return false;
        }
        xh50 xh50Var = (xh50) obj;
        return this.f40871a.equals(xh50Var.f40871a) && this.b == xh50Var.b && this.c.equals(xh50Var.c) && this.d.equals(xh50Var.d) && this.e == xh50Var.e && this.f.equals(xh50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(ua80.b(ua80.b(brm0.e(this.f40871a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("NearestGameDetailsSportModel(nameEng=", this.f40871a, ", isCyber=", this.b, ", timeName=");
        f140.v(sbU, this.c, ", timesName=", this.d, ", id=");
        kng0.z(sbU, this.e, ", name=", this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
