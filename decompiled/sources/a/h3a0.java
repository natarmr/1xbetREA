package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12375a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public h3a0(String str, String str2, String str3, String str4, String str5, long j) {
        brm0.B(str, str4, str5);
        this.f12375a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3a0)) {
            return false;
        }
        h3a0 h3a0Var = (h3a0) obj;
        if (!Intrinsics.d(this.f12375a, h3a0Var.f12375a) || !this.b.equals(h3a0Var.b) || !this.c.equals(h3a0Var.c) || !Intrinsics.d(this.d, h3a0Var.d) || !Intrinsics.d(this.e, h3a0Var.e)) {
            return false;
        }
        long j = h3a0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(this.f12375a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        StringBuilder sbN = b1j.n("PlayerEarnedPointsCellsUiModel(date=", this.f12375a, ", tournamentTitle=", this.b, ", round=");
        f140.v(sbN, this.c, ", dtPoints=", this.d, ", dateDropStatistic=");
        return ua80.m(sbN, this.e, ", backgroundColor=", strI, Separators.RPAREN);
    }
}
