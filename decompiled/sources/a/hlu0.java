package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hlu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13280a;
    public final boolean b;

    public hlu0(boolean z, boolean z2) {
        this.f13280a = z;
        this.b = z2;
    }

    public static hlu0 a(hlu0 hlu0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = hlu0Var.f13280a;
        }
        if ((i & 2) != 0) {
            z2 = hlu0Var.b;
        }
        hlu0Var.getClass();
        return new hlu0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlu0)) {
            return false;
        }
        hlu0 hlu0Var = (hlu0) obj;
        return this.f13280a == hlu0Var.f13280a && this.b == hlu0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f13280a) * 31);
    }

    public final String toString() {
        return hne.n("ViewState(showPlayButton=", ", instantBetAllowed=", Separators.RPAREN, this.f13280a, this.b);
    }
}
