package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29694a;
    public final String b;

    public r1q(String str, boolean z) {
        this.f29694a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1q)) {
            return false;
        }
        r1q r1qVar = (r1q) obj;
        return this.f29694a == r1qVar.f29694a && this.b.equals(r1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f29694a) * 31);
    }

    public final String toString() {
        return ua80.k("PassportNumber(isRequired=", this.f29694a, ", number=", this.b, Separators.RPAREN);
    }
}
