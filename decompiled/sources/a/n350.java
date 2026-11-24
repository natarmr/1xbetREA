package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22834a;
    public final long b;

    public n350(int i, long j) {
        this.f22834a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n350)) {
            return false;
        }
        n350 n350Var = (n350) obj;
        return this.f22834a == n350Var.f22834a && this.b == n350Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f22834a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f22834a, this.b, "OnClickDailyTaskGames(progress=", ", productId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
