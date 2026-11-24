package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1820a;
    public final String b;

    public b1q(String str, boolean z) {
        this.f1820a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1q)) {
            return false;
        }
        b1q b1qVar = (b1q) obj;
        return this.f1820a == b1qVar.f1820a && this.b.equals(b1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f1820a) * 31);
    }

    public final String toString() {
        return ua80.k("Birthday(isRequired=", this.f1820a, ", date=", this.b, Separators.RPAREN);
    }
}
