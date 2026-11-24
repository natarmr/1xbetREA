package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class we9 implements xe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39008a;
    public final int b;

    public we9(String str, int i) {
        str.getClass();
        this.f39008a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we9)) {
            return false;
        }
        we9 we9Var = (we9) obj;
        return Intrinsics.d(this.f39008a, we9Var.f39008a) && this.b == we9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39008a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "LabelIconRight(labelText=", this.f39008a, ", iconResId=", Separators.RPAREN);
    }
}
