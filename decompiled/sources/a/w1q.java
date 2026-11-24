package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38414a;
    public final String b;

    public w1q(String str, boolean z) {
        this.f38414a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1q)) {
            return false;
        }
        w1q w1qVar = (w1q) obj;
        return this.f38414a == w1qVar.f38414a && this.b.equals(w1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f38414a) * 31);
    }

    public final String toString() {
        return ua80.k("PostCode(isRequired=", this.f38414a, ", postCode=", this.b, Separators.RPAREN);
    }
}
