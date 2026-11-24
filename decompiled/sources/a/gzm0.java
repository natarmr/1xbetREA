package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gzm0 implements izm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12186a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final List f;

    public gzm0(String str, String str2, boolean z, String str3, boolean z2, List list) {
        this.f12186a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = list;
    }

    @Override // a.d3h0
    public final String a() {
        return this.b;
    }

    @Override // a.d3h0
    public final String b() {
        return this.d;
    }

    @Override // a.izm0
    public final List d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzm0)) {
            return false;
        }
        gzm0 gzm0Var = (gzm0) obj;
        return this.f12186a.equals(gzm0Var.f12186a) && this.b.equals(gzm0Var.b) && this.c == gzm0Var.c && this.d.equals(gzm0Var.d) && this.e == gzm0Var.e && this.f.equals(gzm0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(brm0.e(ua80.b(this.f12186a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.d3h0
    public final boolean i() {
        return this.e;
    }

    @Override // a.d3h0
    public final boolean j() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Common(periodName=", this.f12186a, ", teamOneScore=", this.b, ", teamOneScoreChanged=");
        f140.s(", teamTwoScore=", this.d, ", teamTwoScoreChanged=", sbN, this.c);
        sbN.append(this.e);
        sbN.append(", periodScores=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
