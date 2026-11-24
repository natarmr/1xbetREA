package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tsc0 implements xsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34455a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public tsc0(a4x a4xVar, int i, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4) {
        a4xVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f34455a = a4xVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsc0)) {
            return false;
        }
        tsc0 tsc0Var = (tsc0) obj;
        return Intrinsics.d(this.f34455a, tsc0Var.f34455a) && this.b == tsc0Var.b && this.c == tsc0Var.c && this.d == tsc0Var.d && this.e == tsc0Var.e && Intrinsics.d(this.f, tsc0Var.f) && Intrinsics.d(this.g, tsc0Var.g) && Intrinsics.d(this.h, tsc0Var.h) && Intrinsics.d(this.i, tsc0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(twn.a(this.b, this.f34455a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(categories=");
        sb.append(this.f34455a);
        sb.append(", pointsCount=");
        sb.append(this.b);
        sb.append(", buttonLoading=");
        ua80.u(", promoPointsVisible=", ", promoRequestVisible=", sb, this.c, this.d);
        f140.s(", accountInfoLabel=", this.f, ", ptsSymbol=", sb, this.e);
        f140.v(sb, this.g, ", requestBonusText=", this.h, ", allCategoryText=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
