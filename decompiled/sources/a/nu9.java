package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24138a;
    public final int b;

    public nu9(String str, int i) {
        this.f24138a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu9)) {
            return false;
        }
        nu9 nu9Var = (nu9) obj;
        return this.f24138a.equals(nu9Var.f24138a) && this.b == nu9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f24138a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "CallbackResultModel(message=", this.f24138a, ", messageId=", Separators.RPAREN);
    }
}
