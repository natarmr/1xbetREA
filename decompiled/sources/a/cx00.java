package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cx00 implements dx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5102a;
    public final int b;

    public cx00(String str, int i) {
        this.f5102a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx00)) {
            return false;
        }
        cx00 cx00Var = (cx00) obj;
        return this.f5102a.equals(cx00Var.f5102a) && this.b == cx00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f5102a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Url(value=", this.f5102a, ", defaultRes=", Separators.RPAREN);
    }
}
