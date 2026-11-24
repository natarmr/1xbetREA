package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22739a;
    public final int b;
    public final boolean c;

    public n190(int i, int i2, boolean z) {
        this.f22739a = i;
        this.b = i2;
        this.c = z;
    }

    public static n190 a(n190 n190Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = n190Var.f22739a;
        }
        boolean z = (i3 & 4) != 0 ? n190Var.c : true;
        n190Var.getClass();
        return new n190(i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n190)) {
            return false;
        }
        n190 n190Var = (n190) obj;
        return this.f22739a == n190Var.f22739a && this.b == n190Var.b && this.c == n190Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f22739a) * 31, 31);
    }

    public final String toString() {
        return rw2.p(dw9.t("UiState(buttonNextTitle=", this.f22739a, ", viewPagerSize=", ", singleEmailState=", this.b), this.c, Separators.RPAREN);
    }
}
