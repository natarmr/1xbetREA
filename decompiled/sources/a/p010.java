package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26125a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;

    public p010(int i, int i2, long j, long j2, String str, String str2) {
        this.f26125a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p010)) {
            return false;
        }
        p010 p010Var = (p010) obj;
        return this.f26125a == p010Var.f26125a && this.b.equals(p010Var.b) && this.c.equals(p010Var.c) && this.d == p010Var.d && this.e == p010Var.e && this.f == p010Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f26125a) * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26125a, "LolHeroOnMapUiModel(heroId=", ", heroName=", this.b);
        axq.s(this.d, ", heroMapPic=", this.c, ", positionX=", sbO);
        rw2.x(sbO, ", positionY=", this.e, ", respawnTimer=");
        return brm0.k(this.f, Separators.RPAREN, sbO);
    }
}
