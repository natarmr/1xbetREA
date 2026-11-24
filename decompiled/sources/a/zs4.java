package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zs4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44889a;
    public final String b;
    public final String c;

    public zs4(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        brm0.B(str, str2, str3);
        this.f44889a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs4)) {
            return false;
        }
        zs4 zs4Var = (zs4) obj;
        return this.f44889a.equals(zs4Var.f44889a) && this.b.equals(zs4Var.b) && this.c.equals(zs4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44889a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("AuthenticatorSocketContainer(countryCode=", this.f44889a, ", phoneNumber=", this.b, ", userId="), this.c, Separators.RPAREN);
    }
}
