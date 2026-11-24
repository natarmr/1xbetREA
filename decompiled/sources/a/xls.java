package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xls implements yls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41090a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;

    public xls(String str, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, int i, boolean z) {
        str6.getClass();
        this.f41090a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = i;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xls)) {
            return false;
        }
        xls xlsVar = (xls) obj;
        if (!this.f41090a.equals(xlsVar.f41090a) || !this.b.equals(xlsVar.b)) {
            return false;
        }
        long j = xlsVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d.equals(xlsVar.d) && this.e.equals(xlsVar.e) && h2t0.a(this.f, xlsVar.f) && this.g.equals(xlsVar.g) && Intrinsics.d(this.h, xlsVar.h) && this.i.equals(xlsVar.i) && this.j == xlsVar.j && this.k == xlsVar.k;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f41090a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.k) + twn.a(this.j, brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, false), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("PreviousMapUiModel(firstTeamImage=", this.f41090a, ", firstTeamWinText=", this.b, ", firstTeamWinColor=");
        f140.v(sbN, strI, ", secondTeamImage=", this.d, ", secondTeamWinText=");
        f140.v(sbN, this.e, ", secondTeamWinColor=", strI2, ", backgroundImage=");
        f140.v(sbN, this.g, ", mapName=", this.h, ", score=");
        twn.w(this.j, this.i, ", needPaddingItem=false, numberOfMap=", ", supportRtl=", sbN);
        return rw2.p(sbN, this.k, Separators.RPAREN);
    }
}
