package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class el7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7983a;
    public final String b;

    public el7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7983a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el7)) {
            return false;
        }
        el7 el7Var = (el7) obj;
        return Intrinsics.d(this.f7983a, el7Var.f7983a) && Intrinsics.d(this.b, el7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7983a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowHideCouponDialogBetId(title=", this.f7983a, ", betId=", this.b, Separators.RPAREN);
    }
}
