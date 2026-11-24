package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hx80 implements ix80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13804a;
    public final int b;

    public hx80(String str, int i) {
        this.f13804a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx80)) {
            return false;
        }
        hx80 hx80Var = (hx80) obj;
        return this.f13804a.equals(hx80Var.f13804a) && this.b == hx80Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f13804a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Url(value=", this.f13804a, ", defaultRes=", Separators.RPAREN);
    }
}
