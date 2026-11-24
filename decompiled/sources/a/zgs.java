package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zgs {
    public static final zgs e = new zgs(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44359a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zgs(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f44359a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgs)) {
            return false;
        }
        zgs zgsVar = (zgs) obj;
        return this.f44359a == zgsVar.f44359a && this.b == zgsVar.b && this.c == zgsVar.c && this.d == zgsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f44359a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", decreaseScoreSecond=", Separators.RPAREN, f140.q("GameItemMainScoresChange(increaseScoreFirst=", ", increaseScoreSecond=", ", decreaseScoreFirst=", this.f44359a, this.b), this.c, this.d);
    }
}
