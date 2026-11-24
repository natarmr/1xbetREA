package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fgo0 implements hgo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e140 f9502a;
    public final int b;

    public fgo0(e140 e140Var, int i) {
        this.f9502a = e140Var;
        this.b = i;
    }

    public static fgo0 a(fgo0 fgo0Var, e140 e140Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            e140Var = fgo0Var.f9502a;
        }
        if ((i2 & 2) != 0) {
            i = fgo0Var.b;
        }
        return new fgo0(e140Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgo0)) {
            return false;
        }
        fgo0 fgo0Var = (fgo0) obj;
        return this.f9502a.equals(fgo0Var.f9502a) && this.b == fgo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f9502a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(styledTabs=" + this.f9502a + ", currentPosition=" + this.b + Separators.RPAREN;
    }
}
