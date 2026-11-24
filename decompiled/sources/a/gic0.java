package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11339a;
    public final String b;

    public gic0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f11339a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gic0)) {
            return false;
        }
        gic0 gic0Var = (gic0) obj;
        return Intrinsics.d(this.f11339a, gic0Var.f11339a) && Intrinsics.d(this.b, gic0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11339a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PromoFieldItemUiModel(title=", this.f11339a, ", promoInfo=", this.b, Separators.RPAREN);
    }
}
