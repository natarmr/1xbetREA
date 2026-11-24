package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26274a;
    public final String b;
    public final String c;

    public p30(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f26274a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.v30
    public final String a() {
        return this.f26274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p30)) {
            return false;
        }
        p30 p30Var = (p30) obj;
        return Intrinsics.d(this.f26274a, p30Var.f26274a) && Intrinsics.d(this.b, p30Var.b) && Intrinsics.d(this.c, p30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f26274a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("RefreshDisabled(advanceTitle=", this.f26274a, ", balanceValue=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
