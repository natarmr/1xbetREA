package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w3g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38500a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;

    public w3g(String str, int i, int i2, int i3, float f, float f2, float f3) {
        this.f38500a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3g)) {
            return false;
        }
        w3g w3gVar = (w3g) obj;
        return this.f38500a.equals(w3gVar.f38500a) && this.b == w3gVar.b && this.c == w3gVar.c && this.d == w3gVar.d && Float.compare(this.e, w3gVar.e) == 0 && Float.compare(this.f, w3gVar.f) == 0 && Float.compare(this.g, w3gVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + defpackage.c.a(defpackage.c.a(twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f38500a.hashCode() * 31, 31), 31), 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CyberCSMatchesStatisticMatchTeamPlayerModel(name=", this.f38500a, ", kills=", ", deaths=");
        axq.r(this.c, this.d, ", assists=", ", kast=", sbP);
        vqd.v(sbP, this.e, ", adr=", this.f, ", rating=");
        return kng0.o(sbP, this.g, Separators.RPAREN);
    }
}
