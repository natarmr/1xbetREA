package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nmv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23791a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public nmv0(String str, String str2, String str3, String str4, String str5, long j) {
        this.f23791a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmv0)) {
            return false;
        }
        nmv0 nmv0Var = (nmv0) obj;
        long j = nmv0Var.f23791a;
        int i = y3d.h;
        return h2t0.a(this.f23791a, j) && this.b.equals(nmv0Var.b) && this.c.equals(nmv0Var.c) && this.d.equals(nmv0Var.d) && this.e.equals(nmv0Var.e) && this.f.equals(nmv0Var.f);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f23791a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("WinterGamesPersonalStatisticUiModel(backgroundColor=", y3d.i(this.f23791a), ", season=", this.b, ", shootingPerc=");
        f140.v(sbN, this.c, ", pronePerc=", this.d, ", standingPerc=");
        return ua80.m(sbN, this.e, ", skiingPerc=", this.f, Separators.RPAREN);
    }
}
