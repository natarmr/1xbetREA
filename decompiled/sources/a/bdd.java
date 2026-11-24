package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bdd implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2393a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final long f;

    public bdd(long j, long j2, String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f2393a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdd)) {
            return false;
        }
        bdd bddVar = (bdd) obj;
        if (!this.f2393a.equals(bddVar.f2393a) || !Intrinsics.d(this.b, bddVar.b) || !Intrinsics.d(this.c, bddVar.c)) {
            return false;
        }
        long j = bddVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && Intrinsics.d(this.e, bddVar.e) && h2t0.a(this.f, bddVar.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f2393a;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f2393a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f) + ua80.b(rw2.b(iB, 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.f);
        StringBuilder sbN = b1j.n("CompareTeamsItemUiModel(key=", this.f2393a, ", valueTitle=", this.b, ", firstTeamValue=");
        f140.v(sbN, this.c, ", firstTeamValueColor=", strI, ", secondTeamValue=");
        return ua80.m(sbN, this.e, ", secondTeamValueColor=", strI2, Separators.RPAREN);
    }
}
