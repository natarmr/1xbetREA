package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22824a;
    public final String b;
    public final String c;

    public n30(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f22824a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.w30
    public final String a() {
        return this.f22824a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n30)) {
            return false;
        }
        n30 n30Var = (n30) obj;
        return Intrinsics.d(this.f22824a, n30Var.f22824a) && Intrinsics.d(this.b, n30Var.b) && Intrinsics.d(this.c, n30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22824a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RefreshActive(advanceTitle=", this.f22824a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
