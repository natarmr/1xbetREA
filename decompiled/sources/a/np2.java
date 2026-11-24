package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class np2 implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23891a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public np2(String str, String str2, String str3, String str4, long j) {
        brm0.B(str, str2, str3);
        this.f23891a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np2)) {
            return false;
        }
        np2 np2Var = (np2) obj;
        if (!Intrinsics.d(this.f23891a, np2Var.f23891a) || !Intrinsics.d(this.b, np2Var.b) || !Intrinsics.d(this.c, np2Var.c) || !this.d.equals(np2Var.d)) {
            return false;
        }
        long j = np2Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f23891a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sbN = b1j.n("AmountSmallHistoryUiModel(titleText=", this.f23891a, ", startAmount=", this.b, ", finalAmount=");
        f140.v(sbN, this.c, ", currency=", this.d, ", finalAmountColor=");
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
