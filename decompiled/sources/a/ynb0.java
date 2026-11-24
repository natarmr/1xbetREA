package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ynb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42933a;
    public final String b;

    public ynb0(String str, String str2) {
        this.f42933a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynb0)) {
            return false;
        }
        ynb0 ynb0Var = (ynb0) obj;
        return this.f42933a.equals(ynb0Var.f42933a) && this.b.equals(ynb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42933a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PowWrapper(captchaId=", this.f42933a, ", foundedHash=", this.b, Separators.RPAREN);
    }
}
