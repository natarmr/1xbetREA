package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ni50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23566a;
    public final long b;
    public final boolean c;

    public ni50(long j, boolean z, long j2) {
        this.f23566a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni50)) {
            return false;
        }
        ni50 ni50Var = (ni50) obj;
        return this.f23566a == ni50Var.f23566a && this.b == ni50Var.b && this.c == ni50Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f23566a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23566a, "NearestGameDetailsTimerModel(timeSec=", ", timeDirection=");
        hne.t(this.b, ", timeRun=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
