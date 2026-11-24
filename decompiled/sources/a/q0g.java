package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q0g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27895a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public q0g(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f27895a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0g)) {
            return false;
        }
        q0g q0gVar = (q0g) obj;
        return this.f27895a == q0gVar.f27895a && this.b == q0gVar.b && this.c == q0gVar.c && this.d == q0gVar.d && this.e == q0gVar.e && this.f == q0gVar.f && this.g == q0gVar.g && this.h == q0gVar.h && this.i == q0gVar.i && this.j == q0gVar.j && this.k == q0gVar.k && this.l == q0gVar.l && this.m == q0gVar.m && this.n == q0gVar.n && this.o == q0gVar.o && this.p == q0gVar.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f27895a) * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberActionUiModel(statisticBlocksRes=", this.f27895a, ", notificationIconRes=", ", favoriteIconRes=", this.b);
        axq.r(this.c, this.d, ", expandedIconRes=", ", marketSettingsIconRes=", sbT);
        axq.r(this.e, this.f, ", favoriteTitleRes=", ", expandedTitleRes=", sbT);
        brm0.w(this.g, ", autoStreamEnabled=", ", statisticBlocksVisible=", sbT, this.h);
        ua80.u(", notificationVisible=", ", favoriteVisible=", sbT, this.i, this.j);
        ua80.u(", isFavorite=", ", autoStreamVisible=", sbT, this.k, this.l);
        ua80.u(", marketGraphVisible=", ", marketsSettingsVisible=", sbT, this.m, this.n);
        return ohs0.p(", statisticsVisible=", Separators.RPAREN, sbT, this.o, this.p);
    }
}
