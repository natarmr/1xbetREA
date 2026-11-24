package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26216a;
    public final String b;

    public p1q(String str, boolean z) {
        this.f26216a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1q)) {
            return false;
        }
        p1q p1qVar = (p1q) obj;
        return this.f26216a == p1qVar.f26216a && this.b.equals(p1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f26216a) * 31);
    }

    public final String toString() {
        return ua80.k("PassportDateExpire(isRequired=", this.f26216a, ", passportDateExpire=", this.b, Separators.RPAREN);
    }
}
