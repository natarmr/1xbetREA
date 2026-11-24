package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kd5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18089a;
    public final int b;

    public kd5(String str, int i) {
        this.f18089a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd5)) {
            return false;
        }
        kd5 kd5Var = (kd5) obj;
        return this.f18089a.equals(kd5Var.f18089a) && this.b == kd5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f18089a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "BackgroundStateModel(backgroundImageUrl=", this.f18089a, ", placeholderRes=", Separators.RPAREN);
    }
}
