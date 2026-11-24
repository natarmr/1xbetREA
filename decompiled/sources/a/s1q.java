package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31470a;
    public final String b;

    public s1q(String str, boolean z) {
        this.f31470a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1q)) {
            return false;
        }
        s1q s1qVar = (s1q) obj;
        return this.f31470a == s1qVar.f31470a && this.b.equals(s1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f31470a) * 31);
    }

    public final String toString() {
        return ua80.k("Password(isRequired=", this.f31470a, ", password=", this.b, Separators.RPAREN);
    }
}
