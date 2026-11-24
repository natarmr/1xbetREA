package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x7r0 implements a8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40427a;
    public final String b;
    public final double c;
    public final String d;
    public final String e;

    public x7r0(double d, int i, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f40427a = i;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
    }

    @Override // a.a8r0
    public final int a() {
        return this.f40427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7r0)) {
            return false;
        }
        x7r0 x7r0Var = (x7r0) obj;
        return this.f40427a == x7r0Var.f40427a && Intrinsics.d(this.b, x7r0Var.b) && Double.compare(this.c, x7r0Var.c) == 0 && Intrinsics.d(this.d, x7r0Var.d) && Intrinsics.d(this.e, x7r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.d(this.c, ua80.b(Integer.hashCode(this.f40427a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f40427a, "Content(style=", ", title=", this.b, ", money=");
        hne.w(sbR, this.c, ", currency=", this.d);
        return rw2.o(sbR, ", topUpText=", this.e, Separators.RPAREN);
    }
}
