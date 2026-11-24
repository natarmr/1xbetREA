package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25341a;
    public final String b;
    public final String c;

    public oj3(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f25341a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3)) {
            return false;
        }
        oj3 oj3Var = (oj3) obj;
        return Intrinsics.d(this.f25341a, oj3Var.f25341a) && Intrinsics.d(this.b, oj3Var.b) && Intrinsics.d(this.c, oj3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f25341a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("AppString(locale=", this.f25341a, ", key=", this.b, ", value="), this.c, Separators.RPAREN);
    }
}
