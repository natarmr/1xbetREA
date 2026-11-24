package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f462a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final qem h;

    public a96(String str, String str2, long j, String str3, String str4, long j2, String str5, qem qemVar) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f462a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = str5;
        this.h = qemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a96)) {
            return false;
        }
        a96 a96Var = (a96) obj;
        if (!Intrinsics.d(this.f462a, a96Var.f462a) || !Intrinsics.d(this.b, a96Var.b)) {
            return false;
        }
        long j = a96Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && Intrinsics.d(this.d, a96Var.d) && Intrinsics.d(this.e, a96Var.e) && h2t0.a(this.f, a96Var.f) && Intrinsics.d(this.g, a96Var.g) && Intrinsics.d(this.h, a96Var.h);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f462a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return (ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g) + (this.h == null ? 0 : -924444967)) * 31;
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("Cricket(teamOneName=", this.f462a, ", teamOneScore=", this.b, ", teamOneScoreColor=");
        f140.v(sbN, strI, ", teamTwoName=", this.d, ", teamTwoScore=");
        f140.v(sbN, this.e, ", teamTwoScoreColor=", strI2, ", infoLabel=");
        sbN.append(this.g);
        sbN.append(", eventStatusIndicatorModel=");
        sbN.append(this.h);
        sbN.append(", timer=null)");
        return sbN.toString();
    }
}
