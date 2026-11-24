package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ig70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14723a;
    public final boolean b;

    public ig70(boolean z, boolean z2) {
        this.f14723a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig70)) {
            return false;
        }
        ig70 ig70Var = (ig70) obj;
        return this.f14723a == ig70Var.f14723a && this.b == ig70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f14723a) * 31);
    }

    public final String toString() {
        return hne.n("AddBetMenu(raiseGame=", ", showBetLayout=", Separators.RPAREN, this.f14723a, this.b);
    }
}
