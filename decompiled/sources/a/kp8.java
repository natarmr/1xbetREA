package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kp8 implements lp8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18665a;
    public final int b;

    public kp8(String str, int i) {
        str.getClass();
        this.f18665a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp8)) {
            return false;
        }
        kp8 kp8Var = (kp8) obj;
        return Intrinsics.d(this.f18665a, kp8Var.f18665a) && this.b == kp8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f18665a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Title(titleText=", this.f18665a, ", titleStyle=", Separators.RPAREN);
    }
}
