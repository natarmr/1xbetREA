package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e580 implements h580 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7221a;
    public final String b;
    public final String c;
    public final String d;
    public final cie0 e;
    public final cie0 f;
    public final lpm g;
    public final boolean h;
    public final boolean i;

    public e580(String str, String str2, String str3, String str4, cie0 cie0Var, cie0 cie0Var2, lpm lpmVar, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f7221a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cie0Var;
        this.f = cie0Var2;
        this.g = lpmVar;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e580)) {
            return false;
        }
        e580 e580Var = (e580) obj;
        return Intrinsics.d(this.f7221a, e580Var.f7221a) && Intrinsics.d(this.b, e580Var.b) && this.c.equals(e580Var.c) && this.d.equals(e580Var.d) && this.e.equals(e580Var.e) && this.f.equals(e580Var.f) && this.g.equals(e580Var.g) && this.h == e580Var.h && this.i == e580Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(f140.e(this.g, (this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f7221a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OnePlayerOpponentsStateModel(firstTeamName=", this.f7221a, ", secondTeamName=", this.b, ", firstTeamLogoUrl=");
        f140.v(sbN, this.c, ", secondTeamLogoUrl=", this.d, ", firstTeamRedCardCounterStateModel=");
        sbN.append(this.e);
        sbN.append(", secondTeamRedCardCounterStateModel=");
        sbN.append(this.f);
        sbN.append(", scoreModel=");
        sbN.append(this.g);
        sbN.append(", isDuel=");
        sbN.append(this.h);
        sbN.append(", isSupportRtl=");
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
