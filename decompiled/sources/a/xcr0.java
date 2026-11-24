package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40661a;
    public final int b;
    public final hyl c;

    public xcr0(int i, int i2, hyl hylVar) {
        this.f40661a = i;
        this.b = i2;
        this.c = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcr0)) {
            return false;
        }
        xcr0 xcr0Var = (xcr0) obj;
        return this.f40661a == xcr0Var.f40661a && this.b == xcr0Var.b && this.c.equals(xcr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f40661a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("TopPlayersTabsUiModel(position=", this.f40661a, ", size=", ", model=", this.b);
        sbT.append(this.c);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
