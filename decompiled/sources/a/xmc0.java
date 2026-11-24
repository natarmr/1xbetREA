package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xmc0 implements zmc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41119a;
    public final String b;
    public final i4 c;

    public xmc0(i4 i4Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f41119a = str;
        this.b = str2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmc0)) {
            return false;
        }
        xmc0 xmc0Var = (xmc0) obj;
        return Intrinsics.d(this.f41119a, xmc0Var.f41119a) && Intrinsics.d(this.b, xmc0Var.b) && Intrinsics.d(this.c, xmc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f41119a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Data(headerTitle=", this.f41119a, ", allButtonTitle=", this.b, ", items=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
