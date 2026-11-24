package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hc7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12806a;
    public final String b;

    public hc7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12806a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc7)) {
            return false;
        }
        hc7 hc7Var = (hc7) obj;
        return Intrinsics.d(this.f12806a, hc7Var.f12806a) && Intrinsics.d(this.b, hc7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12806a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowHideCouponDialog(title=", this.f12806a, ", message=", this.b, Separators.RPAREN);
    }
}
