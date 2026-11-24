package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a6q0 implements b6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f329a;
    public final boolean b;

    public a6q0(boolean z, boolean z2) {
        this.f329a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6q0)) {
            return false;
        }
        a6q0 a6q0Var = (a6q0) obj;
        return this.f329a == a6q0Var.f329a && this.b == a6q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f329a) * 31);
    }

    public final String toString() {
        return hne.n("Password(numberPassword=", ", newPassword=", Separators.RPAREN, this.f329a, this.b);
    }
}
