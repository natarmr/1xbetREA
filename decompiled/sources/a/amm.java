package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class amm implements bmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1115a;
    public final int b;

    public amm(String str, int i) {
        this.f1115a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amm)) {
            return false;
        }
        amm ammVar = (amm) obj;
        return this.f1115a.equals(ammVar.f1115a) && this.b == ammVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f1115a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Url(value=", this.f1115a, ", defaultIconRes=", Separators.RPAREN);
    }
}
