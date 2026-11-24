package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zp30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44741a;
    public final String b;
    public final String c;

    public zp30(String str, String str2, String str3) {
        this.f44741a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp30)) {
            return false;
        }
        zp30 zp30Var = (zp30) obj;
        return this.f44741a.equals(zp30Var.f44741a) && this.b.equals(zp30Var.b) && this.c.equals(zp30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44741a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OpponentModel(id=", this.f44741a, ", imageUrl=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
