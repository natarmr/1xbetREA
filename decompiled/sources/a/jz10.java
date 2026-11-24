package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jz10 {
    public static final jz10 e = new jz10(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17387a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jz10(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17387a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz10)) {
            return false;
        }
        jz10 jz10Var = (jz10) obj;
        return this.f17387a == jz10Var.f17387a && this.b == jz10Var.b && this.c == jz10Var.c && this.d == jz10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f17387a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", decreaseScoreSecond=", Separators.RPAREN, f140.q("MainScoreChanges(increaseScoreFirst=", ", increaseScoreSecond=", ", decreaseScoreFirst=", this.f17387a, this.b), this.c, this.d);
    }
}
