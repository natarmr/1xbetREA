package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10904a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final c6u0 h;

    public g9a0(String str, String str2, String str3, String str4, String str5, String str6, String str7, c6u0 c6u0Var) {
        this.f10904a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = c6u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9a0)) {
            return false;
        }
        g9a0 g9a0Var = (g9a0) obj;
        return this.f10904a.equals(g9a0Var.f10904a) && this.b.equals(g9a0Var.b) && this.c.equals(g9a0Var.c) && this.d.equals(g9a0Var.d) && this.e.equals(g9a0Var.e) && this.f.equals(g9a0Var.f) && this.g.equals(g9a0Var.g) && this.h.equals(g9a0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f10904a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerRaceStatisticModel(name=", this.f10904a, ", countryImage=", this.b, ", time=");
        f140.v(sbN, this.c, ", timeDiff=", this.d, ", place=");
        f140.v(sbN, this.e, ", playerId=", this.f, ", teamTitle=");
        sbN.append(this.g);
        sbN.append(", veloJerseyModel=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
