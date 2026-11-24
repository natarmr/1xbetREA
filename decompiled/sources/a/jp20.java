package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16881a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final int i;

    public jp20(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, int i) {
        brm0.B(str, str5, str6);
        this.f16881a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = str6;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp20)) {
            return false;
        }
        jp20 jp20Var = (jp20) obj;
        if (!Intrinsics.d(this.f16881a, jp20Var.f16881a) || !this.b.equals(jp20Var.b) || !this.c.equals(jp20Var.c) || !this.d.equals(jp20Var.d)) {
            return false;
        }
        long j = jp20Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, jp20Var.f) && Intrinsics.d(this.g, jp20Var.g) && Intrinsics.d(this.h, jp20Var.h) && this.i == jp20Var.i;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f16881a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Integer.hashCode(this.i) + ua80.b(ua80.b(rw2.b(rw2.b(iB, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("MapStatisticItemUiModel(mapName=", this.f16881a, ", mapBackground=", this.b, ", firstTeamWinRate=");
        f140.v(sbN, this.c, ", secondTeamWinRate=", this.d, ", firstTeamWinRateTitleColor=");
        f140.v(sbN, strI, ", secondTeamWinRateTitleColor=", strI2, ", firstTeamMapsCount=");
        f140.v(sbN, this.g, ", secondTeamMapsCount=", this.h, ", placeholder=");
        return rz4.j(this.i, Separators.RPAREN, sbN);
    }
}
