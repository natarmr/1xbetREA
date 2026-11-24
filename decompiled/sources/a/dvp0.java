package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dvp0 implements evp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6757a;
    public final String b;

    public dvp0(String str, String str2) {
        this.f6757a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvp0)) {
            return false;
        }
        dvp0 dvp0Var = (dvp0) obj;
        return this.f6757a.equals(dvp0Var.f6757a) && this.b.equals(dvp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6757a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SuccessGetAuthCode(code=", this.f6757a, ", deepLink=", this.b, Separators.RPAREN);
    }
}
