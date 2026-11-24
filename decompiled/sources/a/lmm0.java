package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lmm0 implements nmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1n f20303a;
    public final j1n b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final sgm g;
    public final sgm h;

    public lmm0(j1n j1nVar, j1n j1nVar2, String str, String str2, String str3, String str4, sgm sgmVar, sgm sgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        str2.getClass();
        this.f20303a = j1nVar;
        this.b = j1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = sgmVar;
        this.h = sgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmm0)) {
            return false;
        }
        lmm0 lmm0Var = (lmm0) obj;
        if (!this.f20303a.equals(lmm0Var.f20303a) || !this.b.equals(lmm0Var.b) || !Intrinsics.d(this.c, lmm0Var.c) || !Intrinsics.d(this.d, lmm0Var.d) || !this.e.equals(lmm0Var.e) || !this.f.equals(lmm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(lmm0Var.g) && this.h.equals(lmm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f20303a.hashCode() * 31)) * 29791, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f20303a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", seedingLeft=");
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
