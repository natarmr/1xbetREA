package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cfc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4254a;
    public final String b;

    public cfc0(String str, String str2) {
        this.f4254a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc0)) {
            return false;
        }
        cfc0 cfc0Var = (cfc0) obj;
        return this.f4254a.equals(cfc0Var.f4254a) && this.b.equals(cfc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4254a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PromoCodeParamModel(name=", this.f4254a, ", value=", this.b, Separators.RPAREN);
    }
}
