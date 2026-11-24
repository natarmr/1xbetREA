package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class coy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4721a;
    public final int b;

    public coy(String str, int i) {
        this.f4721a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coy)) {
            return false;
        }
        coy coyVar = (coy) obj;
        return this.f4721a.equals(coyVar.f4721a) && this.b == coyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f4721a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "KillerJokerCardUiModel(tag=", this.f4721a, ", image=", Separators.RPAREN);
    }
}
