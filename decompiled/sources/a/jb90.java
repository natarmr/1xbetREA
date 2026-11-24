package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jb90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib90 f16228a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public jb90(ib90 ib90Var, String str, int i, String str2, boolean z, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? "" : str2;
        z = (i2 & 16) != 0 ? false : z;
        str.getClass();
        this.f16228a = ib90Var;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb90)) {
            return false;
        }
        jb90 jb90Var = (jb90) obj;
        return this.f16228a == jb90Var.f16228a && Intrinsics.d(this.b, jb90Var.b) && this.c == jb90Var.c && this.d.equals(jb90Var.d) && this.e == jb90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, ua80.b(this.f16228a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentWebViewError(type=");
        sb.append(this.f16228a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", statusCode=");
        kng0.w(this.c, ", description=", this.d, ", sslProceeded=", sb);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
