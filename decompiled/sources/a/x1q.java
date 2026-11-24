package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40132a;
    public final String b;

    public x1q(String str, boolean z) {
        this.f40132a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1q)) {
            return false;
        }
        x1q x1qVar = (x1q) obj;
        return this.f40132a == x1qVar.f40132a && this.b.equals(x1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f40132a) * 31);
    }

    public final String toString() {
        return ua80.k("PromoCode(isRequired=", this.f40132a, ", promoCode=", this.b, Separators.RPAREN);
    }
}
