package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m580 implements p580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21209a;
    public final String b;
    public final String c;
    public final String d;
    public final die0 e;
    public final die0 f;
    public final lpm g;
    public final boolean h;
    public final boolean i;

    public m580(String str, String str2, String str3, String str4, die0 die0Var, die0 die0Var2, lpm lpmVar, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f21209a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = die0Var;
        this.f = die0Var2;
        this.g = lpmVar;
        this.h = z;
        this.i = z2;
    }

    @Override // a.p580
    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m580)) {
            return false;
        }
        m580 m580Var = (m580) obj;
        return Intrinsics.d(this.f21209a, m580Var.f21209a) && Intrinsics.d(this.b, m580Var.b) && this.c.equals(m580Var.c) && this.d.equals(m580Var.d) && this.e.equals(m580Var.e) && this.f.equals(m580Var.f) && this.g.equals(m580Var.g) && this.h == m580Var.h && this.i == m580Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(f140.e(this.g, (this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f21209a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OnePlayerOpponentsUiModel(firstTeamName=", this.f21209a, ", secondTeamName=", this.b, ", firstTeamLogoUrl=");
        f140.v(sbN, this.c, ", secondTeamLogoUrl=", this.d, ", firstTeamRedCardCounterUiModel=");
        sbN.append(this.e);
        sbN.append(", secondTeamRedCardCounterUiModel=");
        sbN.append(this.f);
        sbN.append(", scoreModel=");
        sbN.append(this.g);
        sbN.append(", isDuel=");
        sbN.append(this.h);
        sbN.append(", isSupportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
