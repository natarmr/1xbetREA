package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bum implements fum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3238a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final sem h;
    public final qtm i;

    public bum(String str, String str2, long j, String str3, String str4, long j2, String str5, sem semVar, qtm qtmVar) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f3238a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = str5;
        this.h = semVar;
        this.i = qtmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bum)) {
            return false;
        }
        bum bumVar = (bum) obj;
        if (!Intrinsics.d(this.f3238a, bumVar.f3238a) || !Intrinsics.d(this.b, bumVar.b)) {
            return false;
        }
        long j = bumVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, bumVar.d) && Intrinsics.d(this.e, bumVar.e) && h2t0.a(this.f, bumVar.f) && Intrinsics.d(this.g, bumVar.g) && this.h.equals(bumVar.h) && Intrinsics.d(this.i, bumVar.i);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f3238a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = (this.h.hashCode() + ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        qtm qtmVar = this.i;
        return iHashCode + (qtmVar == null ? 0 : qtmVar.hashCode());
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("V1(teamOneName=", this.f3238a, ", teamOneScore=", this.b, ", teamOneScoreColor=");
        f140.v(sbN, strI, ", teamTwoName=", this.d, ", teamTwoScore=");
        f140.v(sbN, this.e, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        sbN.append(this.g);
        sbN.append(", eventStatusIndicatorModel=");
        sbN.append(this.h);
        sbN.append(", timer=");
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
