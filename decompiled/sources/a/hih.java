package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hih extends iih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13112a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final double f;

    public hih(String str, String str2, String str3, int i, int i2, double d) {
        this.f13112a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = d;
    }

    @Override // a.iih
    public final String a() {
        return this.b;
    }

    @Override // a.iih
    public final String b() {
        return this.f13112a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hih)) {
            return false;
        }
        hih hihVar = (hih) obj;
        return this.f13112a.equals(hihVar.f13112a) && this.b.equals(hihVar.b) && this.c.equals(hihVar.c) && this.d == hihVar.d && this.e == hihVar.e && Double.compare(this.f, hihVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f13112a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LoL(playerName=", this.f13112a, ", playerIcon=", this.b, ", teamIcon=");
        twn.w(this.d, this.c, ", wins=", ", loses=", sbN);
        sbN.append(this.e);
        sbN.append(", kda=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
