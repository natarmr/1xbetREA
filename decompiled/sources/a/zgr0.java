package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zgr0 implements ghr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44358a;
    public final long b;

    public zgr0(int i, long j) {
        this.f44358a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgr0)) {
            return false;
        }
        zgr0 zgr0Var = (zgr0) obj;
        return this.f44358a == zgr0Var.f44358a && this.b == zgr0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f44358a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f44358a, this.b, "OnNavigateToAccurateOutcomesClick(eventOutcomesId=", ", sportId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
