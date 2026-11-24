package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44995a;
    public final boolean b;

    public zu7(boolean z, boolean z2) {
        this.f44995a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu7)) {
            return false;
        }
        zu7 zu7Var = (zu7) obj;
        return this.f44995a == zu7Var.f44995a && this.b == zu7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f44995a) * 31);
    }

    public final String toString() {
        return hne.n("ShowMakeBetDialog(isAltDesign=", ", isPromoBetEnabled=", Separators.RPAREN, this.f44995a, this.b);
    }
}
