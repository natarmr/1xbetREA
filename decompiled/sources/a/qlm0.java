package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qlm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1n f28942a;
    public final h1n b;
    public final mpm c;
    public final String d;
    public final String e;
    public final String f;
    public final mgm g;
    public final mgm h;

    public qlm0(h1n h1nVar, h1n h1nVar2, mpm mpmVar, String str, String str2, String str3, mgm mgmVar, mgm mgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f28942a = h1nVar;
        this.b = h1nVar2;
        this.c = mpmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = mgmVar;
        this.h = mgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlm0)) {
            return false;
        }
        qlm0 qlm0Var = (qlm0) obj;
        if (!this.f28942a.equals(qlm0Var.f28942a) || !this.b.equals(qlm0Var.b) || !this.c.equals(qlm0Var.c) || !Intrinsics.d(this.d, qlm0Var.d) || !this.e.equals(qlm0Var.e) || !this.f.equals(qlm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(qlm0Var.g) && this.h.equals(qlm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f28942a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f28942a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", lowerBracket=");
        sb.append(x0mVar);
        sb.append(", startResultIndicator=");
        sb.append(this.g);
        sb.append(", endResultIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
