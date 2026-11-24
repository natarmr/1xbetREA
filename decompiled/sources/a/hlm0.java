package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hlm0 implements jlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1n f13270a;
    public final i1n b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public hlm0(i1n i1nVar, i1n i1nVar2, String str, String str2, String str3, String str4) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        str2.getClass();
        this.f13270a = i1nVar;
        this.b = i1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlm0)) {
            return false;
        }
        hlm0 hlm0Var = (hlm0) obj;
        if (!this.f13270a.equals(hlm0Var.f13270a) || !this.b.equals(hlm0Var.b) || !Intrinsics.d(this.c, hlm0Var.c) || !Intrinsics.d(this.d, hlm0Var.d) || !this.e.equals(hlm0Var.e) || !this.f.equals(hlm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f13270a.hashCode() * 31)) * 29791, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f13270a);
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
