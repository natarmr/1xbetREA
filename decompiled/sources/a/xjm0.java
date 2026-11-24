package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xjm0 implements zjm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40993a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public xjm0(String str, String str2, String str3, String str4, String str5) {
        x0m x0mVar = x0m.f40076a;
        brm0.B(str, str2, str3);
        this.f40993a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjm0)) {
            return false;
        }
        xjm0 xjm0Var = (xjm0) obj;
        if (!Intrinsics.d(this.f40993a, xjm0Var.f40993a) || !Intrinsics.d(this.b, xjm0Var.b) || !Intrinsics.d(this.c, xjm0Var.c) || !this.d.equals(xjm0Var.d) || !this.e.equals(xjm0Var.e)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f40993a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sbN = b1j.n("TwoOpponents(firstOpponentLabel=", this.f40993a, ", secondOpponentLabel=", this.b, ", infoLabel=");
        f140.v(sbN, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        sbN.append(this.e);
        sbN.append(", lowerBracket=");
        sbN.append(x0mVar);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
