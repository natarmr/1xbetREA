package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fih extends iih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9587a;
    public final String b;
    public final int c;
    public final double d;

    public fih(double d, int i, String str, String str2) {
        this.f9587a = str;
        this.b = str2;
        this.c = i;
        this.d = d;
    }

    @Override // a.iih
    public final String a() {
        return this.b;
    }

    @Override // a.iih
    public final String b() {
        return this.f9587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fih)) {
            return false;
        }
        fih fihVar = (fih) obj;
        return this.f9587a.equals(fihVar.f9587a) && this.b.equals(fihVar.b) && this.c == fihVar.c && Double.compare(this.d, fihVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + twn.a(this.c, ua80.b(this.f9587a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CS(playerName=", this.f9587a, ", playerIcon=", this.b, ", maps=");
        sbN.append(this.c);
        sbN.append(", rating=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
