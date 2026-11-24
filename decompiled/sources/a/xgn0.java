package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xgn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40848a;
    public final String b;
    public final String c;
    public final long d;

    public xgn0(long j, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f40848a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgn0)) {
            return false;
        }
        xgn0 xgn0Var = (xgn0) obj;
        if (!Intrinsics.d(this.f40848a, xgn0Var.f40848a) || !Intrinsics.d(this.b, xgn0Var.b) || !Intrinsics.d(this.c, xgn0Var.c)) {
            return false;
        }
        long j = xgn0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f40848a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iB;
    }

    public final String toString() {
        return ua80.m(b1j.n("SuccessBetInfoRowUiModel(name=", this.f40848a, ", value=", this.b, ", currency="), this.c, ", valueColor=", y3d.i(this.d), Separators.RPAREN);
    }
}
