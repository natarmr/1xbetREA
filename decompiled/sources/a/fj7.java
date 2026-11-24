package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fj7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9623a;
    public final boolean b;

    public fj7(String str, boolean z) {
        str.getClass();
        this.f9623a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj7)) {
            return false;
        }
        fj7 fj7Var = (fj7) obj;
        return Intrinsics.d(this.f9623a, fj7Var.f9623a) && this.b == fj7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9623a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OnSaleConfirmedResult(betId=", this.f9623a, ", hideCoupon=", this.b, Separators.RPAREN);
    }
}
