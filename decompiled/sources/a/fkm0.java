package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fkm0 implements hkm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1n f9701a;
    public final h1n b;
    public final mpm c;
    public final String d;
    public final String e;
    public final String f;

    public fkm0(h1n h1nVar, h1n h1nVar2, mpm mpmVar, String str, String str2, String str3) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f9701a = h1nVar;
        this.b = h1nVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkm0)) {
            return false;
        }
        fkm0 fkm0Var = (fkm0) obj;
        if (!this.f9701a.equals(fkm0Var.f9701a) || !this.b.equals(fkm0Var.b) || !this.c.equals(fkm0Var.c) || !Intrinsics.d(this.d, fkm0Var.d) || !this.e.equals(fkm0Var.e) || !this.f.equals(fkm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f9701a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f9701a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", lowerBracket=");
        sb.append(x0mVar);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
