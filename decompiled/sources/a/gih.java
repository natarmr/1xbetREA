package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gih extends iih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11346a;
    public final String b;
    public final int c;
    public final int d;
    public final double e;

    public gih(String str, String str2, int i, int i2, double d) {
        this.f11346a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = d;
    }

    @Override // a.iih
    public final String a() {
        return this.b;
    }

    @Override // a.iih
    public final String b() {
        return this.f11346a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gih)) {
            return false;
        }
        gih gihVar = (gih) obj;
        return this.f11346a.equals(gihVar.f11346a) && this.b.equals(gihVar.b) && this.c == gihVar.c && this.d == gihVar.d && Double.compare(this.e, gihVar.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + twn.a(this.d, twn.a(this.c, ua80.b(this.f11346a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Dota(playerName=", this.f11346a, ", playerIcon=", this.b, ", wins=");
        axq.r(this.c, this.d, ", loses=", ", kda=", sbN);
        return axq.l(sbN, this.e, Separators.RPAREN);
    }
}
