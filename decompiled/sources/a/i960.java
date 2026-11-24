package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i960 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14372a;
    public final String b;

    public i960(String str, String str2) {
        this.f14372a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i960)) {
            return false;
        }
        i960 i960Var = (i960) obj;
        return this.f14372a.equals(i960Var.f14372a) && this.b.equals(i960Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14372a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("NumbersModel(currentNumber=", this.f14372a, ", allGameNumbers=", this.b, Separators.RPAREN);
    }
}
