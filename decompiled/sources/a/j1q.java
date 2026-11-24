package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15747a;
    public final String b;

    public j1q(String str, boolean z) {
        this.f15747a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1q)) {
            return false;
        }
        j1q j1qVar = (j1q) obj;
        return this.f15747a == j1qVar.f15747a && this.b.equals(j1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f15747a) * 31);
    }

    public final String toString() {
        return ua80.k("Email(isRequired=", this.f15747a, ", email=", this.b, Separators.RPAREN);
    }
}
