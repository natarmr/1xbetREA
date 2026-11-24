package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6710a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final ztr g;
    public final ank0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final long o;

    public dur(long j, long j2, long j3, long j4, boolean z, long j5, ztr ztrVar, ank0 ank0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j6) {
        this.f6710a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = j5;
        this.g = ztrVar;
        this.h = ank0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dur)) {
            return false;
        }
        dur durVar = (dur) obj;
        return this.f6710a == durVar.f6710a && this.b == durVar.b && this.c == durVar.c && this.d == durVar.d && this.e == durVar.e && this.f == durVar.f && this.g.equals(durVar.g) && this.h.equals(durVar.h) && this.i == durVar.i && this.j == durVar.j && this.k == durVar.k && this.l == durVar.l && this.m == durVar.m && this.n == durVar.n && this.o == durVar.o;
    }

    public final int hashCode() {
        return Long.hashCode(this.o) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a((this.g.hashCode() + rw2.b(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f6710a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h.f1159a), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        String strP = w6x.p("GameName(value=", this.h, Separators.RPAREN);
        String strD = defpackage.c.d("StreamVisible(value=", Separators.RPAREN, this.i);
        String strD2 = defpackage.c.d("ZoneVisible(value=", Separators.RPAREN, this.j);
        String strD3 = defpackage.c.d("NotificationActivated(value=", Separators.RPAREN, this.k);
        String strD4 = defpackage.c.d("NotificationVisible(value=", Separators.RPAREN, this.l);
        String strD5 = defpackage.c.d("FavoriteSelected(value=", Separators.RPAREN, this.m);
        String strD6 = defpackage.c.d("FavoriteVisible(value=", Separators.RPAREN, this.n);
        StringBuilder sbQ = kng0.q(this.f6710a, "GameCardHeaderUiModel(mainId=", ", gameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", constId=", this.c, ", sportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        kng0.A(sbQ, ", subSportId=", this.f, ", sportIcon=");
        sbQ.append(this.g);
        sbQ.append(", gameName=");
        sbQ.append(strP);
        sbQ.append(", streamVisible=");
        f140.v(sbQ, strD, ", zoneVisible=", strD2, ", notificationActivated=");
        f140.v(sbQ, strD3, ", notificationVisible=", strD4, ", favoriteSelected=");
        f140.v(sbQ, strD5, ", favoriteVisible=", strD6, ", champId=");
        return brm0.k(this.o, Separators.RPAREN, sbQ);
    }
}
