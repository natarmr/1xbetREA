package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f40956a;
    public final int b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public xip(int i, int i2, boolean z, boolean z2) {
        this.f40956a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xip)) {
            return false;
        }
        xip xipVar = (xip) obj;
        return this.f40956a == xipVar.f40956a && this.b == xipVar.b && this.c == xipVar.c && this.d == xipVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, Integer.hashCode(this.f40956a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", clickable=", Separators.RPAREN, dw9.t("FeedNavigationBarButtonModel(buttonId=", this.f40956a, ", iconResId=", ", selected=", this.b), this.c, this.d);
    }
}
