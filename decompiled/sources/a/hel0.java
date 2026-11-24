package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12928a;
    public final int b;

    public hel0(String str, int i) {
        this.f12928a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hel0)) {
            return false;
        }
        hel0 hel0Var = (hel0) obj;
        return this.f12928a.equals(hel0Var.f12928a) && this.b == hel0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f12928a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "SportIconUiModel(iconUrl=", this.f12928a, ", iconColorAttr=", Separators.RPAREN);
    }
}
