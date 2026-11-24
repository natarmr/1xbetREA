package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8869a;
    public final boolean b;

    public f3l0(boolean z, boolean z2) {
        this.f8869a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3l0)) {
            return false;
        }
        f3l0 f3l0Var = (f3l0) obj;
        return this.f8869a == f3l0Var.f8869a && this.b == f3l0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f8869a) * 31);
    }

    public final String toString() {
        return hne.n("TwoActionIcons(notificationIconActive=", ", favouriteIconActive=", Separators.RPAREN, this.f8869a, this.b);
    }
}
