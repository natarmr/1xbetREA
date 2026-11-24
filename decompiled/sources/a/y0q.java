package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y0q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41820a;
    public final String b;

    public y0q(String str, boolean z) {
        this.f41820a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0q)) {
            return false;
        }
        y0q y0qVar = (y0q) obj;
        return this.f41820a == y0qVar.f41820a && this.b.equals(y0qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f41820a) * 31);
    }

    public final String toString() {
        return ua80.k("Address(isRequired=", this.f41820a, ", address=", this.b, Separators.RPAREN);
    }
}
