package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kxf0 implements pxf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19053a;
    public final String b;

    public kxf0(String str, String str2) {
        this.f19053a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxf0)) {
            return false;
        }
        kxf0 kxf0Var = (kxf0) obj;
        return this.f19053a.equals(kxf0Var.f19053a) && this.b.equals(kxf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19053a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GetEmailForce(description=", this.f19053a, ", email=", this.b, Separators.RPAREN);
    }
}
