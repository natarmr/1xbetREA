package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43633a;
    public final String b;

    public z1q(String str, boolean z) {
        this.f43633a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1q)) {
            return false;
        }
        z1q z1qVar = (z1q) obj;
        return this.f43633a == z1qVar.f43633a && this.b.equals(z1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f43633a) * 31);
    }

    public final String toString() {
        return ua80.k("RepeatPassword(isRequired=", this.f43633a, ", password=", this.b, Separators.RPAREN);
    }
}
