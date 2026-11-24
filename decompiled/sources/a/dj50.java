package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6166a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public dj50(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.f6166a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j2;
    }

    public static dj50 a(dj50 dj50Var, long j) {
        long j2 = dj50Var.f6166a;
        boolean z = dj50Var.b;
        boolean z2 = dj50Var.c;
        boolean z3 = dj50Var.d;
        dj50Var.getClass();
        return new dj50(j2, j, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj50)) {
            return false;
        }
        dj50 dj50Var = (dj50) obj;
        return znq0.e(this.f6166a, dj50Var.f6166a) && this.b == dj50Var.b && this.c == dj50Var.c && this.d == dj50Var.d && znq0.e(this.e, dj50Var.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Long.hashCode(this.f6166a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strH = znq0.h(this.f6166a);
        String strH2 = znq0.h(this.e);
        StringBuilder sbU = brm0.u("NearestGameTimerModel(timePassed=", strH, ", timeBackDirection=", this.b, ", timeRun=");
        ua80.u(", isLive=", ", timerValue=", sbU, this.c, this.d);
        return axq.n(sbU, strH2, Separators.RPAREN);
    }
}
