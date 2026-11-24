package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kac0 extends mac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17956a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public kac0(String str, String str2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f17956a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kac0)) {
            return false;
        }
        kac0 kac0Var = (kac0) obj;
        return Intrinsics.d(this.f17956a, kac0Var.f17956a) && this.b == kac0Var.b && this.c == kac0Var.c && this.d.equals(kac0Var.d) && this.e == kac0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(brm0.e(brm0.e(this.f17956a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("EnterPromo(buttonText=", this.f17956a, ", isButtonEnable=", this.b, ", showNotFoundError=");
        f140.s(", promoValue=", this.d, ", showLoading=", sbU, this.c);
        return rw2.p(sbU, this.e, Separators.RPAREN);
    }
}
