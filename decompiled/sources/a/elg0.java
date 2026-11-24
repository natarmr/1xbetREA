package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class elg0 implements glg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7996a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public elg0(String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f7996a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elg0)) {
            return false;
        }
        elg0 elg0Var = (elg0) obj;
        return Intrinsics.d(this.f7996a, elg0Var.f7996a) && Intrinsics.d(this.b, elg0Var.b) && Intrinsics.d(this.c, elg0Var.c) && this.d == elg0Var.d && this.e == elg0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(this.f7996a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RefRule(text=", this.f7996a, ", refTitle=", this.b, ", link=");
        brm0.C(this.c, ", isDeeplink=", ", refVisible=", sbN, this.d);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
