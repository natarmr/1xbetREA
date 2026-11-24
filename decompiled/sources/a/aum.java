package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class aum implements fum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1486a;
    public final String b;
    public final String c;
    public final long d;
    public final c280 e;
    public final c280 f;
    public final String g;
    public final String h;
    public final long i;
    public final stm j;

    public aum(String str, String str2, String str3, long j, c280 c280Var, c280 c280Var2, String str4, String str5, long j2, stm stmVar) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f1486a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = c280Var;
        this.f = c280Var2;
        this.g = str4;
        this.h = str5;
        this.i = j2;
        this.j = stmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aum)) {
            return false;
        }
        aum aumVar = (aum) obj;
        if (!Intrinsics.d(this.f1486a, aumVar.f1486a) || !Intrinsics.d(this.b, aumVar.b) || !Intrinsics.d(this.c, aumVar.c)) {
            return false;
        }
        long j = aumVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(aumVar.e) && this.f.equals(aumVar.f) && Intrinsics.d(this.g, aumVar.g) && Intrinsics.d(this.h, aumVar.h) && h2t0.a(this.i, aumVar.i) && this.j.equals(aumVar.j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f1486a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.j.hashCode() + rw2.b(ua80.b(ua80.b(hne.g(this.f, hne.g(this.e, rw2.b(iB, 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.i);
        StringBuilder sbN = b1j.n("Default(infoLabel=", this.f1486a, ", teamOneName=", this.b, ", teamOneScore=");
        f140.v(sbN, this.c, ", teamOneScoreColor=", strI, ", teamOneLogo=");
        f140.u(sbN, this.e, ", teamTwoLogo=", this.f, ", teamTwoName=");
        f140.v(sbN, this.g, ", teamTwoScore=", this.h, ", teamTwoScoreColor=");
        sbN.append(strI2);
        sbN.append(", options=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
