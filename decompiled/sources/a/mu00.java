package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mu00 implements vu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22391a;
    public final boolean b;

    public mu00(boolean z, boolean z2) {
        this.f22391a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu00)) {
            return false;
        }
        mu00 mu00Var = (mu00) obj;
        return this.f22391a == mu00Var.f22391a && this.b == mu00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f22391a) * 31);
    }

    public final String toString() {
        return hne.n("EndSession(force=", ", clearUserCredentials=", Separators.RPAREN, this.f22391a, this.b);
    }
}
