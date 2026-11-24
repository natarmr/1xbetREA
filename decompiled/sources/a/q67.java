package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28187a;
    public final String b;

    public q67(String str, String str2) {
        str.getClass();
        this.f28187a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q67)) {
            return false;
        }
        q67 q67Var = (q67) obj;
        return Intrinsics.d(this.f28187a, q67Var.f28187a) && this.b.equals(q67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28187a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowCouponSold(title=", this.f28187a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
