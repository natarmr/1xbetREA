package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m2o implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th90 f21071a;
    public final a4x b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public m2o(th90 th90Var, i4 i4Var, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        th90Var.getClass();
        i4Var.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f21071a = th90Var;
        this.b = i4Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2o)) {
            return false;
        }
        m2o m2oVar = (m2o) obj;
        return Intrinsics.d(this.f21071a, m2oVar.f21071a) && Intrinsics.d(this.b, m2oVar.b) && this.c.equals(m2oVar.c) && this.d.equals(m2oVar.d) && Intrinsics.d(this.e, m2oVar.e) && Intrinsics.d(this.f, m2oVar.f) && Intrinsics.d(this.g, m2oVar.g) && Intrinsics.d(this.h, m2oVar.h) && this.i == m2oVar.i && this.j == m2oVar.j && this.k == m2oVar.k;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TIC_TAC_TOE_KEY";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.b, (this.f21071a.hashCode() + 1881013872) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsportUniversalTicTacToeUiModel(key=TIC_TAC_TOE_KEY, boardValues=");
        sb.append(this.f21071a);
        sb.append(", roundHistory=");
        sb.append(this.b);
        sb.append(", crossIcon=");
        f140.v(sb, this.c, ", noughtIcon=", this.d, ", typefacePath=");
        f140.v(sb, this.e, ", roundTitle=", this.f, ", crossesFullScore=");
        f140.v(sb, this.g, ", noughtsFullScore=", this.h, ", hasGameData=");
        ua80.u(", lastRound=", ", animate=", sb, this.i, this.j);
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
