package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ijm0 implements ljm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14882a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final z1m e;
    public final String f;
    public final String g;
    public final String h;

    public ijm0(String str, String str2, c280 c280Var, c280 c280Var2, z1m z1mVar, String str3, String str4, String str5) {
        x0m x0mVar = x0m.f40076a;
        brm0.B(str, str2, str3);
        this.f14882a = str;
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
        if (!(obj instanceof ijm0)) {
            return false;
        }
        ijm0 ijm0Var = (ijm0) obj;
        if (!Intrinsics.d(this.f14882a, ijm0Var.f14882a) || !Intrinsics.d(this.b, ijm0Var.b) || !this.c.equals(ijm0Var.c) || !this.d.equals(ijm0Var.d) || !this.e.equals(ijm0Var.e) || !Intrinsics.d(this.f, ijm0Var.f) || !this.g.equals(ijm0Var.g) || !this.h.equals(ijm0Var.h)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(rz4.b(this.e.f43628a, hne.g(this.d, hne.g(this.c, ua80.b(this.f14882a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sbN = b1j.n("Tennis(firstOpponentLabel=", this.f14882a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
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
