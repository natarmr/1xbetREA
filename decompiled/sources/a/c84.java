package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class c84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3895a;
    public final String b;
    public final long c;
    public final va80 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public c84(String str, String str2, long j, va80 va80Var, String str3, boolean z, boolean z2) {
        this.f3895a = str;
        this.b = str2;
        this.c = j;
        this.d = va80Var;
        this.e = str3;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        c84 c84Var = (c84) obj;
        return this.f3895a.equals(c84Var.f3895a) && this.b.equals(c84Var.b) && this.c == c84Var.c && this.d == c84Var.d && this.e.equals(c84Var.e) && this.f == c84Var.f && this.g == c84Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(ua80.b((this.d.hashCode() + rw2.b(ua80.b(this.f3895a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthHistoryItemModel(deviceName=", this.f3895a, ", place=", this.b, ", date=");
        sbN.append(this.c);
        sbN.append(", osType=");
        sbN.append(this.d);
        w6x.z(", sessionId=", this.e, ", current=", sbN, this.f);
        return f140.n(sbN, ", hasAuthenticator=", this.g, Separators.RPAREN);
    }
}
