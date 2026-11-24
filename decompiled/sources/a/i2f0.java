package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i2f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14045a;
    public final String b;
    public final boolean c;

    public i2f0(String str, String str2, boolean z) {
        this.f14045a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2f0)) {
            return false;
        }
        i2f0 i2f0Var = (i2f0) obj;
        return this.f14045a.equals(i2f0Var.f14045a) && this.b.equals(i2f0Var.b) && this.c == i2f0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f14045a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("RegistrationResult(registrationGuid=", this.f14045a, ", secret=", this.b, ", canUseAuthenticator="), this.c, Separators.RPAREN);
    }
}
