package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ytb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43210a;
    public final boolean b;
    public final boolean c;

    public ytb0(boolean z, boolean z2, boolean z3) {
        this.f43210a = z;
        this.b = z2;
        this.c = z3;
    }

    public static ytb0 a(ytb0 ytb0Var, int i) {
        return new ytb0((i & 1) != 0 ? ytb0Var.f43210a : true, (i & 2) != 0 ? ytb0Var.b : true, (i & 4) != 0 ? ytb0Var.c : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytb0)) {
            return false;
        }
        ytb0 ytb0Var = (ytb0) obj;
        return this.f43210a == ytb0Var.f43210a && this.b == ytb0Var.b && this.c == ytb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f43210a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("PrepareMakeBetUiModel(isApprovedBet=", ", isAdvanceBet=", ", isChangedToSystem=", this.f43210a, this.b), this.c, Separators.RPAREN);
    }
}
