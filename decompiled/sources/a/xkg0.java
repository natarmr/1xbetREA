package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41028a;
    public final String b;
    public final String c;

    public xkg0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f41028a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkg0)) {
            return false;
        }
        xkg0 xkg0Var = (xkg0) obj;
        return Intrinsics.d(this.f41028a, xkg0Var.f41028a) && Intrinsics.d(this.b, xkg0Var.b) && Intrinsics.d(this.c, xkg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(ua80.b(Boolean.hashCode(true) * 31, 31, this.f41028a), 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RuleButtonConfig(visible=true, siteLink=", this.f41028a, ", deepLink=", this.b, ", label="), this.c, Separators.RPAREN);
    }
}
