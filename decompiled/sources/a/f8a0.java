package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f8a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9096a;
    public final int b;

    public f8a0(String str, int i) {
        this.f9096a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8a0)) {
            return false;
        }
        f8a0 f8a0Var = (f8a0) obj;
        return this.f9096a.equals(f8a0Var.f9096a) && this.b == f8a0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f9096a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "PlayerMenuItemModel(title=", this.f9096a, ", menuType=", Separators.RPAREN);
    }
}
