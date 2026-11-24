package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5212a;
    public final String b;

    public cz8(String str, String str2) {
        this.f5212a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz8)) {
            return false;
        }
        cz8 cz8Var = (cz8) obj;
        return this.f5212a.equals(cz8Var.f5212a) && this.b.equals(cz8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5212a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("BrandInfoState(title=", this.f5212a, ", description=", this.b, Separators.RPAREN);
    }
}
