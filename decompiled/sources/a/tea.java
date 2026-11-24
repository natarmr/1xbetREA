package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33810a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;

    public tea(int i, int i2, long j, String str, String str2) {
        this.f33810a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tea)) {
            return false;
        }
        tea teaVar = (tea) obj;
        if (!this.f33810a.equals(teaVar.f33810a) || this.b != teaVar.b || this.c != teaVar.c || !this.d.equals(teaVar.d)) {
            return false;
        }
        long j = teaVar.e;
        int i = y3d.h;
        return h2t0.a(this.e, j);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.a(this.c, twn.a(this.b, this.f33810a.hashCode() * 31, 31), 31), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + iB;
    }

    public final String toString() {
        String strC = una0.c(this.b);
        String strC2 = una0.c(this.c);
        String strI = y3d.i(this.e);
        StringBuilder sbN = b1j.n("CardCricketGameProgressUiModel(id=", this.f33810a, ", batsman=", strC, ", bowler=");
        f140.v(sbN, strC2, ", points=", this.d, ", pointsColor=");
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
