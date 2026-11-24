package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ahs {
    public static final ahs e = new ahs(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f888a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ahs(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f888a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahs)) {
            return false;
        }
        ahs ahsVar = (ahs) obj;
        return this.f888a == ahsVar.f888a && this.b == ahsVar.b && this.c == ahsVar.c && this.d == ahsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f888a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", periodSecondDecrease=", Separators.RPAREN, f140.q("GameItemPeriodScoreChanges(periodFirstIncrease=", ", periodSecondIncrease=", ", periodFirstDecrease=", this.f888a, this.b), this.c, this.d);
    }
}
