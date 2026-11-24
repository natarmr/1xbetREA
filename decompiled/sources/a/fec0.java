package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fec0 implements jec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9400a;
    public final String b;

    public fec0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9400a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fec0)) {
            return false;
        }
        fec0 fec0Var = (fec0) obj;
        return Intrinsics.d(this.f9400a, fec0Var.f9400a) && Intrinsics.d(this.b, fec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9400a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CopyPromoCode(promoCode=", this.f9400a, ", message=", this.b, Separators.RPAREN);
    }
}
