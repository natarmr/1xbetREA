package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wl1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39333a;
    public final long b;

    public wl1(int i, long j) {
        this.f39333a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.f39333a == wl1Var.f39333a && this.b == wl1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f39333a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f39333a, this.b, "AvailableGamesScreen(bonusId=", ", accountId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
