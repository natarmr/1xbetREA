package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27413a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final nqf h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public pqf(String str, int i, int i2, int i3, int i4, float f, int i5, nqf nqfVar, boolean z, boolean z2, int i6, int i7, int i8) {
        this.f27413a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = i5;
        this.h = nqfVar;
        this.i = z;
        this.j = z2;
        this.k = i6;
        this.l = i7;
        this.m = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqf)) {
            return false;
        }
        pqf pqfVar = (pqf) obj;
        return this.f27413a.equals(pqfVar.f27413a) && this.b == pqfVar.b && this.c == pqfVar.c && this.d == pqfVar.d && this.e == pqfVar.e && Float.compare(this.f, pqfVar.f) == 0 && this.g == pqfVar.g && this.h.equals(pqfVar.h) && this.i == pqfVar.i && this.j == pqfVar.j && this.k == pqfVar.k && this.l == pqfVar.l && this.m == pqfVar.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + twn.a(this.l, twn.a(this.k, brm0.e(brm0.e((this.h.hashCode() + twn.a(this.g, defpackage.c.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f27413a.hashCode() * 31, 31), 31), 31), 31), this.f, 31), 31)) * 31, 31, this.i), 31, this.j), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Cs2PlayersModel(playerName=", this.f27413a, ", countMoney=", ", countKills=");
        axq.r(this.c, this.d, ", countAssists=", ", countDeaths=", sbP);
        sbP.append(this.e);
        sbP.append(", playerRating=");
        sbP.append(this.f);
        sbP.append(", playerHealth=");
        sbP.append(this.g);
        sbP.append(", weaponModel=");
        sbP.append(this.h);
        sbP.append(", alive=");
        ua80.u(", hasBomb=", ", xMapPosition=", sbP, this.i, this.j);
        axq.r(this.k, this.l, ", yMapPosition=", ", zMapPosition=", sbP);
        return rz4.j(this.m, Separators.RPAREN, sbP);
    }
}
