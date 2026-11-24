package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4335a;
    public final int b;
    public final boolean c;

    public cgx(int i, int i2, boolean z) {
        this.f4335a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgx)) {
            return false;
        }
        cgx cgxVar = (cgx) obj;
        return this.f4335a == cgxVar.f4335a && this.b == cgxVar.b && this.c == cgxVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f4335a) * 31, 31);
    }

    public final String toString() {
        return rw2.p(dw9.t("InsetsState(bottomNavigationInset=", this.f4335a, ", keyboardInset=", ", isKeyboardVisible=", this.b), this.c, Separators.RPAREN);
    }
}
