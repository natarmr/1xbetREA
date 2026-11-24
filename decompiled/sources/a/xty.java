package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xty implements yty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41486a;
    public final String b;
    public final String c;
    public final long d;

    public xty(long j, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f41486a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xty)) {
            return false;
        }
        xty xtyVar = (xty) obj;
        if (!Intrinsics.d(this.f41486a, xtyVar.f41486a) || !Intrinsics.d(this.b, xtyVar.b) || !Intrinsics.d(this.c, xtyVar.c)) {
            return false;
        }
        long j = xtyVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f41486a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        return ua80.m(b1j.n("WithChanges(currentValue=", this.f41486a, ", oldValue=", this.b, ", currencySymbol="), this.c, ", color=", y3d.i(this.d), Separators.RPAREN);
    }
}
