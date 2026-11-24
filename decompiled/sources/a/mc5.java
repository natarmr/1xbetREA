package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mc5 implements nc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21535a;
    public final boolean b;

    public mc5(boolean z, long j) {
        this.f21535a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc5)) {
            return false;
        }
        mc5 mc5Var = (mc5) obj;
        return this.f21535a == mc5Var.f21535a && this.b == mc5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f21535a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f21535a, "StatisticBackground(sportId=", ", nightMode=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
