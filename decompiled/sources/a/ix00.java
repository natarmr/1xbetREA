package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ix00 implements jx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15517a;
    public final int b;

    public ix00(String str, int i) {
        this.f15517a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix00)) {
            return false;
        }
        ix00 ix00Var = (ix00) obj;
        return this.f15517a.equals(ix00Var.f15517a) && this.b == ix00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f15517a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Url(value=", this.f15517a, ", defaultRes=", Separators.RPAREN);
    }
}
