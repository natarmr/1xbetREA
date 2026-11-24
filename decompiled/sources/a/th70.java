package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class th70 extends zh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33949a;
    public final boolean b;

    public th70(boolean z, boolean z2) {
        this.f33949a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th70)) {
            return false;
        }
        th70 th70Var = (th70) obj;
        return this.f33949a == th70Var.f33949a && this.b == th70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f33949a) * 31);
    }

    public final String toString() {
        return hne.n("GameStarted(autoSpin=", ", freeBet=", Separators.RPAREN, this.f33949a, this.b);
    }
}
