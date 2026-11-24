package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class md5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21580a;
    public final int b;

    public md5(String str, int i) {
        this.f21580a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md5)) {
            return false;
        }
        md5 md5Var = (md5) obj;
        return this.f21580a.equals(md5Var.f21580a) && this.b == md5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21580a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "BackgroundStateModel(backgroundImageUrl=", this.f21580a, ", placeholderRes=", Separators.RPAREN);
    }
}
