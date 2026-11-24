package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class se90 {
    public static final se90 e = new se90(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32068a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public se90(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f32068a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se90)) {
            return false;
        }
        se90 se90Var = (se90) obj;
        return this.f32068a == se90Var.f32068a && this.b == se90Var.b && this.c == se90Var.c && this.d == se90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f32068a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", periodSecondDecrease=", Separators.RPAREN, f140.q("PeriodScoreChanges(periodFirstIncrease=", ", periodSecondIncrease=", ", periodFirstDecrease=", this.f32068a, this.b), this.c, this.d);
    }
}
