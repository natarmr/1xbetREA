package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42328a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public yb70(long j, long j2, long j3, long j4, String str, boolean z) {
        str.getClass();
        this.f42328a = z;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb70)) {
            return false;
        }
        yb70 yb70Var = (yb70) obj;
        if (this.f42328a != yb70Var.f42328a || !Intrinsics.d(this.b, yb70Var.b)) {
            return false;
        }
        long j = yb70Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, yb70Var.d) && h2t0.a(this.e, yb70Var.e) && h2t0.a(this.f, yb70Var.f);
    }

    public final int hashCode() {
        int iB = ua80.b(Boolean.hashCode(this.f42328a) * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + rw2.b(rw2.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        String strI3 = y3d.i(this.e);
        String strI4 = y3d.i(this.f);
        StringBuilder sbQ = axq.q("OneXGamesWebGameTaxMessageUiModel(visible=", ", text=", this.b, this.f42328a, ", textColor=");
        f140.v(sbQ, strI, ", iconColor=", strI2, ", iconBgColor=");
        return ua80.m(sbQ, strI3, ", bgColor=", strI4, Separators.RPAREN);
    }
}
