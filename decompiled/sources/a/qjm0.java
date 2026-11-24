package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qjm0 implements sjm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28847a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final String e;
    public final String f;
    public final String g;

    public qjm0(String str, String str2, c280 c280Var, c280 c280Var2, String str3, String str4, String str5) {
        x0m x0mVar = x0m.f40076a;
        brm0.B(str, str2, str3);
        this.f28847a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjm0)) {
            return false;
        }
        qjm0 qjm0Var = (qjm0) obj;
        if (!Intrinsics.d(this.f28847a, qjm0Var.f28847a) || !Intrinsics.d(this.b, qjm0Var.b) || !this.c.equals(qjm0Var.c) || !this.d.equals(qjm0Var.d) || !Intrinsics.d(this.e, qjm0Var.e) || !this.f.equals(qjm0Var.f) || !this.g.equals(qjm0Var.g)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(hne.g(this.d, hne.g(this.c, ua80.b(this.f28847a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sbN = b1j.n("TwoOpponents(firstOpponentLabel=", this.f28847a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", infoLabel=");
        f140.v(sbN, this.e, ", seedingLeft=", this.f, ", seedingRight=");
        sbN.append(this.g);
        sbN.append(", lowerBracket=");
        sbN.append(x0mVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
