package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ly6 f15575a;
    public final boolean b;

    public iy6(ly6 ly6Var, boolean z) {
        this.f15575a = ly6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy6)) {
            return false;
        }
        iy6 iy6Var = (iy6) obj;
        return this.f15575a.equals(iy6Var.f15575a) && this.b == iy6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15575a.hashCode() * 31);
    }

    public final String toString() {
        return "BetGameInfoKeyModel(betGameInfo=" + this.f15575a + ", isAuthorized=" + this.b + Separators.RPAREN;
    }
}
