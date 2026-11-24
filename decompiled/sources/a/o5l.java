package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24692a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;

    public o5l(int i, int i2, int i3, String str, boolean z, boolean z2) {
        this.f24692a = i;
        this.b = str;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5l)) {
            return false;
        }
        o5l o5lVar = (o5l) obj;
        return this.f24692a == o5lVar.f24692a && this.b.equals(o5lVar.b) && this.c == o5lVar.c && this.d == o5lVar.d && this.e == o5lVar.e && this.f == o5lVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, twn.a(this.d, brm0.e(ua80.b(Integer.hashCode(this.f24692a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f24692a, "DotaMapHeroUiModel(id=", ", image=", this.b, ", radiantTeam=");
        ua80.q(this.d, ", positionX=", ", positionY=", sbR, this.c);
        return ohs0.k(this.e, ", visibility=", Separators.RPAREN, sbR, this.f);
    }
}
