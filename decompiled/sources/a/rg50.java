package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rg50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30417a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final String f;
    public final long g;

    public rg50(String str, String str2, String str3, boolean z, long j, String str4, long j2) {
        this.f30417a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = str4;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg50)) {
            return false;
        }
        rg50 rg50Var = (rg50) obj;
        return this.f30417a.equals(rg50Var.f30417a) && this.b.equals(rg50Var.b) && this.c.equals(rg50Var.c) && this.d == rg50Var.d && this.e == rg50Var.e && this.f.equals(rg50Var.f) && this.g == rg50Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ua80.b(rw2.b(brm0.e(ua80.b(ua80.b(this.f30417a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NearestGameDetailsLigaModel(nameEng=", this.f30417a, ", countryImage=", this.b, ", image=");
        brm0.C(this.c, ", isDuelChamp=", ", id=", sbN, this.d);
        kng0.z(sbN, this.e, ", name=", this.f);
        return rw2.n(sbN, this.g, ", cyberType=", Separators.RPAREN);
    }
}
