package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class knd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epd0 f18581a;
    public final boolean b;

    public knd0(epd0 epd0Var, boolean z) {
        this.f18581a = epd0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knd0)) {
            return false;
        }
        knd0 knd0Var = (knd0) obj;
        return this.f18581a.equals(knd0Var.f18581a) && this.b == knd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18581a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickBetState(fastBetsUiModel=" + this.f18581a + ", isVisible=" + this.b + Separators.RPAREN;
    }
}
