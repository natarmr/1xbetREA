package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3637a;
    public final String b;

    public c2q(String str, boolean z) {
        this.f3637a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2q)) {
            return false;
        }
        c2q c2qVar = (c2q) obj;
        return this.f3637a == c2qVar.f3637a && this.b.equals(c2qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f3637a) * 31);
    }

    public final String toString() {
        return ua80.k("SecondLastName(isRequired=", this.f3637a, ", secondLastName=", this.b, Separators.RPAREN);
    }
}
