package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f31591a;
    public final mb90 b;
    public final double c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final Bitmap m;
    public final boolean n;

    public s47(n3w n3wVar, mb90 mb90Var, double d, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, long j, boolean z7, Bitmap bitmap, boolean z8) {
        this.f31591a = n3wVar;
        this.b = mb90Var;
        this.c = d;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = z5;
        this.j = z6;
        this.k = j;
        this.l = z7;
        this.m = bitmap;
        this.n = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s47)) {
            return false;
        }
        s47 s47Var = (s47) obj;
        return this.f31591a.equals(s47Var.f31591a) && this.b.equals(s47Var.b) && Double.compare(this.c, s47Var.c) == 0 && this.d == s47Var.d && this.e == s47Var.e && this.f == s47Var.f && this.g == s47Var.g && this.h.equals(s47Var.h) && this.i == s47Var.i && this.j == s47Var.j && this.k == s47Var.k && this.l == s47Var.l && Intrinsics.d(this.m, s47Var.m) && this.n == s47Var.n;
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.b(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.c, (this.b.hashCode() + (this.f31591a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Bitmap bitmap = this.m;
        return Boolean.hashCode(this.n) + ((iE + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetHistoryInfoItemUiModel(historyItem=");
        sb.append(this.f31591a);
        sb.append(", payoutUiModel=");
        sb.append(this.b);
        sb.append(", profit=");
        rz4.x(sb, this.c, ", powerBetEnabled=", this.d);
        w6x.A(", duplicateCouponEnabled=", ", betCoeffTypeVisible=", sb, this.e, this.f);
        hne.u(", saleEnabled=", ", tagText=", this.h, sb, this.g);
        w6x.A(", isOptionBet=", ", isEachWay=", sb, this.i, this.j);
        kng0.A(sb, ", userId=", this.k, ", organizerIsVisible=");
        sb.append(this.l);
        sb.append(", qrCodeBitmap=");
        sb.append(this.m);
        sb.append(", is24HourFormat=");
        return rw2.p(sb, this.n, Separators.RPAREN);
    }
}
