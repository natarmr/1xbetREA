package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class alm0 implements clm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1n f1076a;
    public final j1n b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public alm0(j1n j1nVar, j1n j1nVar2, String str, String str2, String str3, String str4) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        str2.getClass();
        this.f1076a = j1nVar;
        this.b = j1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alm0)) {
            return false;
        }
        alm0 alm0Var = (alm0) obj;
        if (!this.f1076a.equals(alm0Var.f1076a) || !this.b.equals(alm0Var.b) || !Intrinsics.d(this.c, alm0Var.c) || !Intrinsics.d(this.d, alm0Var.d) || !this.e.equals(alm0Var.e) || !this.f.equals(alm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f1076a.hashCode() * 31)) * 29791, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f1076a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=, scoreResultTitle=");
        f140.v(sb, this.c, ", infoLabel=", this.d, ", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", lowerBracket=");
        sb.append(x0mVar);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
