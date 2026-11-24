package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class elt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8017a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public elt(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.f8017a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elt)) {
            return false;
        }
        elt eltVar = (elt) obj;
        return this.f8017a.equals(eltVar.f8017a) && this.b.equals(eltVar.b) && this.c.equals(eltVar.c) && this.d.equals(eltVar.d) && this.e == eltVar.e && this.f == eltVar.f && this.g == eltVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f8017a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GeoIpModel(countryCode=", this.f8017a, ", countryName=", this.b, ", regionName=");
        f140.v(sbN, this.c, ", cityName=", this.d, ", countryId=");
        axq.r(this.e, this.f, ", regionId=", ", cityId=", sbN);
        return rz4.j(this.g, Separators.RPAREN, sbN);
    }
}
