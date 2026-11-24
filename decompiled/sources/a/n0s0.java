package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n0s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22716a;
    public final int b;

    public n0s0(float f, int i) {
        this.f22716a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0s0)) {
            return false;
        }
        n0s0 n0s0Var = (n0s0) obj;
        return Float.compare(this.f22716a, n0s0Var.f22716a) == 0 && this.b == n0s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.f22716a) * 31);
    }

    public final String toString() {
        return "TournamentCsFeedStatisticTopPlayerScoreModel(rating=" + this.f22716a + ", maps=" + this.b + Separators.RPAREN;
    }
}
