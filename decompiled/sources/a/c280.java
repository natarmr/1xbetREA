package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c280 implements d280 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3613a;
    public final int b;

    public c280(String str, int i) {
        str.getClass();
        this.f3613a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c280)) {
            return false;
        }
        c280 c280Var = (c280) obj;
        return Intrinsics.d(this.f3613a, c280Var.f3613a) && this.b == c280Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f3613a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Real(iconUrl=", this.f3613a, ", placeholderResId=", Separators.RPAREN);
    }
}
