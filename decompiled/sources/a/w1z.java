package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w1z implements y1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38425a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final ib30 h;
    public final boolean i;

    public w1z(String str, String str2, String str3, long j, String str4, String str5, long j2, ib30 ib30Var, boolean z) {
        str3.getClass();
        str5.getClass();
        this.f38425a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
        this.h = ib30Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1z)) {
            return false;
        }
        w1z w1zVar = (w1z) obj;
        if (!this.f38425a.equals(w1zVar.f38425a) || !this.b.equals(w1zVar.b) || !Intrinsics.d(this.c, w1zVar.c)) {
            return false;
        }
        long j = w1zVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e.equals(w1zVar.e) && Intrinsics.d(this.f, w1zVar.f) && h2t0.a(this.g, w1zVar.g) && this.h.equals(w1zVar.h) && this.i == w1zVar.i;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f38425a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + rw2.b(ua80.b(ua80.b(rw2.b(iB, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("HeadToHead(gameId=", this.f38425a, ", firstTeamIcon=", this.b, ", firstTeamMatchResultTitle=");
        f140.v(sbN, this.c, ", firstTeamMatchResultTitleColor=", strI, ", secondTeamIcon=");
        f140.v(sbN, this.e, ", secondTeamMatchResultTitle=", this.f, ", secondTeamMatchResultTitleColor=");
        sbN.append(strI2);
        sbN.append(", matchInfo=");
        sbN.append(this.h);
        sbN.append(", lastMatch=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
