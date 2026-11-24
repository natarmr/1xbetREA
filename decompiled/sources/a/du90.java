package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class du90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6690a;
    public final long b;
    public final boolean c;
    public final a4x d;
    public final String e;
    public final String f;

    public du90(String str, long j, boolean z, a4x a4xVar, String str2, String str3) {
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f6690a = str;
        this.b = j;
        this.c = z;
        this.d = a4xVar;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du90)) {
            return false;
        }
        du90 du90Var = (du90) obj;
        if (!Intrinsics.d(this.f6690a, du90Var.f6690a)) {
            return false;
        }
        long j = du90Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c == du90Var.c && Intrinsics.d(this.d, du90Var.d) && Intrinsics.d(this.e, du90Var.e) && Intrinsics.d(this.f, du90Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f6690a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + ua80.b(cs0.b(this.d, brm0.e(rw2.b(iHashCode, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PinUiModel(titlePinCode=", this.f6690a, ", titlePinColor=", y3d.i(this.b), ", animateTitle=");
        sbN.append(this.c);
        sbN.append(", pinKeyboard=");
        sbN.append(this.d);
        sbN.append(", pin=");
        return ua80.m(sbN, this.e, ", pinMasked=", this.f, Separators.RPAREN);
    }
}
