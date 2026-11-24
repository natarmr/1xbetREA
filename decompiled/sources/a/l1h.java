package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19252a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public l1h(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f19252a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1h)) {
            return false;
        }
        l1h l1hVar = (l1h) obj;
        return this.f19252a == l1hVar.f19252a && this.b == l1hVar.b && this.c == l1hVar.c && this.d == l1hVar.d && this.e == l1hVar.e && this.f == l1hVar.f && this.g == l1hVar.g && this.h == l1hVar.h && this.i == l1hVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f19252a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberIndividualHeroStatisticModel(killsCount=", this.f19252a, ", deadCount=", ", assistsCount=", this.b);
        axq.r(this.c, this.d, ", lastHitsCount=", ", deniesCount=", sbT);
        axq.r(this.e, this.f, ", overallValueOfHero=", ", goldInMinute=", sbT);
        axq.r(this.g, this.h, ", experienceInMinute=", ", goldCount=", sbT);
        return rz4.j(this.i, Separators.RPAREN, sbT);
    }
}
