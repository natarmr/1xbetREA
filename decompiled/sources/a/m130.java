package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20985a;
    public final String b;
    public final String c;

    public m130(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f20985a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m130)) {
            return false;
        }
        m130 m130Var = (m130) obj;
        return Intrinsics.d(this.f20985a, m130Var.f20985a) && Intrinsics.d(this.b, m130Var.b) && Intrinsics.d(this.c, m130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f20985a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowCouponAlreadyExistsDialog(title=", this.f20985a, ", message=", this.b, ", textForButton="), this.c, Separators.RPAREN);
    }
}
