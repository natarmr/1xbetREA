package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ymc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42880a;
    public final boolean b;
    public final String c;
    public final String d;
    public final vcp e;

    public ymc(boolean z, boolean z2, String str, String str2, vcp vcpVar) {
        this.f42880a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = vcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymc)) {
            return false;
        }
        ymc ymcVar = (ymc) obj;
        return this.f42880a == ymcVar.f42880a && this.b == ymcVar.b && this.c.equals(ymcVar.c) && this.d.equals(ymcVar.d) && this.e == ymcVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f42880a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ClassicFavoritesContainerConfig(isBettingDisabled=", ", hasPopularBalance=", ", accountControlStyle=", this.f42880a, this.b);
        f140.v(sbQ, this.c, ", tabStyle=", this.d, ", favoriteStyle=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
