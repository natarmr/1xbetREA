package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class plm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1n f27191a;
    public final h1n b;
    public final mpm c;
    public final String d;
    public final String e;
    public final String f;
    public final mgm g;
    public final mgm h;

    public plm0(h1n h1nVar, h1n h1nVar2, mpm mpmVar, String str, String str2, String str3, mgm mgmVar, mgm mgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f27191a = h1nVar;
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
        if (!(obj instanceof plm0)) {
            return false;
        }
        plm0 plm0Var = (plm0) obj;
        if (!this.f27191a.equals(plm0Var.f27191a) || !this.b.equals(plm0Var.b) || !this.c.equals(plm0Var.c) || !Intrinsics.d(this.d, plm0Var.d) || !this.e.equals(plm0Var.e) || !this.f.equals(plm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(plm0Var.g) && this.h.equals(plm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ohs0.e(this.c, (this.b.hashCode() + (this.f27191a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("Tennis(firstOpponent=");
        sb.append(this.f27191a);
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
