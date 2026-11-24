package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm5 f10130a;
    public final its0 b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;

    public fts0(bm5 bm5Var, its0 its0Var, long j, boolean z, boolean z2, String str, String str2, int i) {
        this.f10130a = bm5Var;
        this.b = its0Var;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = i;
    }

    public static fts0 a(fts0 fts0Var, its0 its0Var, long j, boolean z, String str, int i) {
        bm5 bm5Var = fts0Var.f10130a;
        if ((i & 2) != 0) {
            its0Var = fts0Var.b;
        }
        its0 its0Var2 = its0Var;
        if ((i & 4) != 0) {
            j = fts0Var.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = fts0Var.d;
        }
        boolean z2 = z;
        boolean z3 = fts0Var.e;
        if ((i & 32) != 0) {
            str = fts0Var.f;
        }
        String str2 = str;
        String str3 = fts0Var.g;
        int i2 = fts0Var.h;
        fts0Var.getClass();
        str2.getClass();
        return new fts0(bm5Var, its0Var2, j2, z2, z3, str2, str3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fts0)) {
            return false;
        }
        fts0 fts0Var = (fts0) obj;
        return this.f10130a == fts0Var.f10130a && this.b.equals(fts0Var.b) && this.c == fts0Var.c && this.d == fts0Var.d && this.e == fts0Var.e && this.f.equals(fts0Var.f) && this.g.equals(fts0Var.g) && this.h == fts0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ua80.b(ua80.b(brm0.e(brm0.e(rw2.b((this.b.hashCode() + (this.f10130a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvBetJackpotState(balanceScreenType=");
        sb.append(this.f10130a);
        sb.append(", tvBetJackpotState=");
        sb.append(this.b);
        sb.append(", selectedDate=");
        hne.t(this.c, ", hasBlockingError=", sb, this.d);
        hne.u(", fromAggregator=", ", currency=", this.f, sb, this.e);
        axq.s(this.h, ", bannerTranslateId=", this.g, ", lottieAnimationTypeId=", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
