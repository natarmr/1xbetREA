package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ipk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15168a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final lok0 e;
    public final boolean f;

    public ipk0(long j, long j2, boolean z, boolean z2, lok0 lok0Var, boolean z3) {
        this.f15168a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = lok0Var;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipk0)) {
            return false;
        }
        ipk0 ipk0Var = (ipk0) obj;
        return this.f15168a == ipk0Var.f15168a && this.b == ipk0Var.b && this.c == ipk0Var.c && this.d == ipk0Var.d && this.e.equals(ipk0Var.e) && this.f == ipk0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + brm0.e(brm0.e(rw2.b(Long.hashCode(this.f15168a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15168a, "SpecialEventMainScreenSettings(sportId=", ", subSportId=");
        hne.t(this.b, ", isTabletDevice=", sbQ, this.c);
        sbQ.append(", isSmallDevice=");
        sbQ.append(this.d);
        sbQ.append(", specialEventInfo=");
        sbQ.append(this.e);
        return f140.n(sbQ, ", hasWhoWinSection=", this.f, Separators.RPAREN);
    }
}
