package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21532a;
    public final boolean b;

    public mc3(boolean z, boolean z2) {
        this.f21532a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc3)) {
            return false;
        }
        mc3 mc3Var = (mc3) obj;
        return this.f21532a == mc3Var.f21532a && this.b == mc3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f21532a) * 31);
    }

    public final String toString() {
        return hne.n("AppBarToolbarState(expanded=", ", buttonVisible=", Separators.RPAREN, this.f21532a, this.b);
    }
}
