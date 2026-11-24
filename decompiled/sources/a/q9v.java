package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9v f28366a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public q9v(s9v s9vVar, boolean z, boolean z2, boolean z3) {
        this.f28366a = s9vVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9v)) {
            return false;
        }
        q9v q9vVar = (q9v) obj;
        return this.f28366a.equals(q9vVar.f28366a) && this.b == q9vVar.b && this.c == q9vVar.c && this.d == q9vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f28366a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoldRushAnimationUiModel(coordinateModel=");
        sb.append(this.f28366a);
        sb.append(", itemIsFilled=");
        sb.append(this.b);
        sb.append(", playerHasBonus=");
        return ohs0.p(", playerMoveBack=", Separators.RPAREN, sb, this.c, this.d);
    }
}
