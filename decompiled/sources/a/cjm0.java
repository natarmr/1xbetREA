package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cjm0 implements ejm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4468a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final z1m e;
    public final String f;
    public final String g;
    public final String h;

    public cjm0(String str, String str2, c280 c280Var, c280 c280Var2, z1m z1mVar, String str3, String str4, String str5) {
        x0m x0mVar = x0m.f40076a;
        brm0.B(str, str2, str3);
        this.f4468a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = z1mVar;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjm0)) {
            return false;
        }
        cjm0 cjm0Var = (cjm0) obj;
        if (!Intrinsics.d(this.f4468a, cjm0Var.f4468a) || !Intrinsics.d(this.b, cjm0Var.b) || !this.c.equals(cjm0Var.c) || !this.d.equals(cjm0Var.d) || !this.e.equals(cjm0Var.e) || !Intrinsics.d(this.f, cjm0Var.f) || !this.g.equals(cjm0Var.g) || !this.h.equals(cjm0Var.h)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(rz4.b(this.e.f43628a, hne.g(this.d, hne.g(this.c, ua80.b(this.f4468a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sbN = b1j.n("TwoOpponents(firstOpponentLabel=", this.f4468a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", customScore=");
        sbN.append(this.e);
        sbN.append(", infoLabel=");
        sbN.append(this.f);
        sbN.append(", seedingLeft=");
        f140.v(sbN, this.g, ", seedingRight=", this.h, ", lowerBracket=");
        sbN.append(x0mVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
