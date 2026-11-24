package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28025a;
    public final String b;
    public final String c;

    public q30(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f28025a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.w30
    public final String a() {
        return this.f28025a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q30)) {
            return false;
        }
        q30 q30Var = (q30) obj;
        return Intrinsics.d(this.f28025a, q30Var.f28025a) && Intrinsics.d(this.b, q30Var.b) && Intrinsics.d(this.c, q30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28025a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RefreshDisabled(advanceTitle=", this.f28025a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
