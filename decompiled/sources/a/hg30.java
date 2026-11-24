package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13000a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public hg30(long j, long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13000a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg30)) {
            return false;
        }
        hg30 hg30Var = (hg30) obj;
        return znq0.e(this.f13000a, hg30Var.f13000a) && znq0.e(this.b, hg30Var.b) && this.c == hg30Var.c && this.d == hg30Var.d && this.e == hg30Var.e && this.f.equals(hg30Var.f) && this.g == hg30Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.e(brm0.e(brm0.e(rw2.b(Long.hashCode(this.f13000a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MatchTimerUiModel(timerValue=", znq0.h(this.f13000a), ", eventTime=", znq0.h(this.b), ", live=");
        ua80.u(", timeBackDirection=", ", matchIsBreak=", sbN, this.c, this.d);
        f140.s(", dopTimeStr=", this.f, ", transfer=", sbN, this.e);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
