package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2780a;
    public final String b;

    public bl7(String str, String str2) {
        str.getClass();
        this.f2780a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl7)) {
            return false;
        }
        bl7 bl7Var = (bl7) obj;
        return Intrinsics.d(this.f2780a, bl7Var.f2780a) && this.b.equals(bl7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2780a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowCouponSold(title=", this.f2780a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
