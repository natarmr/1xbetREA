package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34205a;
    public final String b;
    public final String c;
    public final fks0 d;
    public final long e;
    public final xmp0 f;
    public final boolean g;

    public tmp0(String str, String str2, String str3, fks0 fks0Var, long j, xmp0 xmp0Var, boolean z) {
        this.f34205a = str;
        this.b = str2;
        this.c = str3;
        this.d = fks0Var;
        this.e = j;
        this.f = xmp0Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmp0)) {
            return false;
        }
        tmp0 tmp0Var = (tmp0) obj;
        return this.f34205a.equals(tmp0Var.f34205a) && this.b.equals(tmp0Var.b) && this.c.equals(tmp0Var.c) && this.d == tmp0Var.d && this.e == tmp0Var.e && this.f == tmp0Var.f && this.g == tmp0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + rw2.b((this.d.hashCode() + ua80.b(ua80.b(this.f34205a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamTransferModel(name=", this.f34205a, ", logo=", this.b, ", role=");
        sbN.append(this.c);
        sbN.append(", roleGroup=");
        sbN.append(this.d);
        sbN.append(", feedId=");
        sbN.append(this.e);
        sbN.append(", type=");
        sbN.append(this.f);
        return f140.n(sbN, ", hasStat=", this.g, Separators.RPAREN);
    }
}
