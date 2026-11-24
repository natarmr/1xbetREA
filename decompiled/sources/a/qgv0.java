package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qgv0 implements o8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28705a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    public qgv0(String str, String str2, String str3, String str4, String str5, long j) {
        this.f28705a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgv0)) {
            return false;
        }
        qgv0 qgv0Var = (qgv0) obj;
        if (!this.f28705a.equals(qgv0Var.f28705a) || !this.b.equals(qgv0Var.b) || !this.c.equals(qgv0Var.c) || !this.d.equals(qgv0Var.d)) {
            return false;
        }
        long j = qgv0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && this.f.equals(qgv0Var.f);
    }

    @Override // a.o8w
    public final String getKey() {
        return this.f28705a;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f28705a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + rw2.b(iB, 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sbN = b1j.n("WinBackBannerUiModel(key=", this.f28705a, ", bannerTitle=", this.b, ", bannerDescription=");
        f140.v(sbN, this.c, ", bannerImage=", this.d, ", colorKey=");
        return ua80.m(sbN, strI, ", winBackAnalytics=", this.f, Separators.RPAREN);
    }
}
