package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gn70 extends hn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11573a;
    public final int b;

    public gn70(String str, int i) {
        this.f11573a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn70)) {
            return false;
        }
        gn70 gn70Var = (gn70) obj;
        return this.f11573a.equals(gn70Var.f11573a) && this.b == gn70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f11573a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "LoadBackgroundByUrl(url=", this.f11573a, ", placeholder=", Separators.RPAREN);
    }
}
