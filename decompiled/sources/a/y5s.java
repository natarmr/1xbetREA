package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y5s {
    public static final y5s i = new y5s(s470.GAME_UNAVAILABLE, false, false, false, false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f42064a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ y5s(s470 s470Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        this(s470Var, z, z2, z3, z4, z5, (i2 & 64) == 0, (i2 & 256) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5s)) {
            return false;
        }
        y5s y5sVar = (y5s) obj;
        return this.f42064a == y5sVar.f42064a && this.b == y5sVar.b && this.c == y5sVar.c && this.d == y5sVar.d && this.e == y5sVar.e && this.f == y5sVar.f && this.g == y5sVar.g && this.h == y5sVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(this.f42064a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameConfig(type=");
        sb.append(this.f42064a);
        sb.append(", autoSpinAllowed=");
        sb.append(this.b);
        sb.append(", multiStepGame=");
        ua80.u(", multiChoiceGame=", ", raiseGame=", sb, this.c, this.d);
        ua80.u(", endGameFragmentSkipClick=", ", delayedBet=", sb, this.e, this.f);
        return ohs0.p(", customEndFlow=false, choiceRequiredGame=", Separators.RPAREN, sb, this.g, this.h);
    }

    public y5s(s470 s470Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        s470Var.getClass();
        this.f42064a = s470Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }
}
