package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33150a;
    public final String b;
    public final String c;

    public t130(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f33150a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t130)) {
            return false;
        }
        t130 t130Var = (t130) obj;
        return Intrinsics.d(this.f33150a, t130Var.f33150a) && Intrinsics.d(this.b, t130Var.b) && Intrinsics.d(this.c, t130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33150a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowQuickBetNetworkError(title=", this.f33150a, ", message=", this.b, ", textForButton="), this.c, Separators.RPAREN);
    }
}
