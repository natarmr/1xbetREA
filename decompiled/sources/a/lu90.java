package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lu90 implements a9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20663a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final naa0 h;

    public lu90(String str, String str2, String str3, int i, int i2, String str4, boolean z, naa0 naa0Var) {
        this.f20663a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = z;
        this.h = naa0Var;
    }

    @Override // a.a9a0
    public final String a() {
        return this.f20663a;
    }

    @Override // a.a9a0
    public final String b() {
        return this.f;
    }

    @Override // a.a9a0
    public final naa0 c() {
        return this.h;
    }

    @Override // a.a9a0
    public final String d() {
        return this.c;
    }

    @Override // a.a9a0
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu90)) {
            return false;
        }
        lu90 lu90Var = (lu90) obj;
        return this.f20663a.equals(lu90Var.f20663a) && this.b.equals(lu90Var.b) && this.c.equals(lu90Var.c) && this.d == lu90Var.d && this.e == lu90Var.e && this.f.equals(lu90Var.f) && this.g == lu90Var.g && this.h.equals(lu90Var.h);
    }

    @Override // a.a9a0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(ua80.b(twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(this.f20663a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PitchPlayerModel(playerId=", this.f20663a, ", name=", this.b, ", logo=");
        twn.w(this.d, this.c, ", line=", ", position=", sbN);
        kng0.w(this.e, ", playerType=", this.f, ", hasMarkets=", sbN);
        sbN.append(this.g);
        sbN.append(", playerRoleModel=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
