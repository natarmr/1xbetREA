package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rim0 implements xim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30551a;
    public final String b;
    public final c280 c;
    public final c280 d;
    public final lpm e;
    public final String f;
    public final String g;
    public final String h;

    public rim0(String str, String str2, c280 c280Var, c280 c280Var2, lpm lpmVar, String str3, String str4, String str5) {
        x0m x0mVar = x0m.f40076a;
        brm0.B(str, str2, str3);
        this.f30551a = str;
        this.b = str2;
        this.c = c280Var;
        this.d = c280Var2;
        this.e = lpmVar;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rim0)) {
            return false;
        }
        rim0 rim0Var = (rim0) obj;
        if (!Intrinsics.d(this.f30551a, rim0Var.f30551a) || !Intrinsics.d(this.b, rim0Var.b) || !this.c.equals(rim0Var.c) || !this.d.equals(rim0Var.d) || !this.e.equals(rim0Var.e) || !Intrinsics.d(this.f, rim0Var.f) || !this.g.equals(rim0Var.g) || !this.h.equals(rim0Var.h)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(f140.e(this.e, hne.g(this.d, hne.g(this.c, ua80.b(this.f30551a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sbN = b1j.n("Cricket(firstOpponentLabel=", this.f30551a, ", secondOpponentLabel=", this.b, ", firstOpponentIcon=");
        f140.u(sbN, this.c, ", secondOpponentIcon=", this.d, ", score=");
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
