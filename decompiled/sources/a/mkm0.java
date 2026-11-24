package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mkm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1n f21950a;
    public final k1n b;
    public final a2m c;
    public final String d;
    public final String e;
    public final String f;

    public mkm0(k1n k1nVar, k1n k1nVar2, a2m a2mVar, String str, String str2, String str3) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f21950a = k1nVar;
        this.b = k1nVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkm0)) {
            return false;
        }
        mkm0 mkm0Var = (mkm0) obj;
        if (!this.f21950a.equals(mkm0Var.f21950a) || !this.b.equals(mkm0Var.b) || !this.c.equals(mkm0Var.c) || !Intrinsics.d(this.d, mkm0Var.d) || !this.e.equals(mkm0Var.e) || !this.f.equals(mkm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f21950a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f21950a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", customScore=");
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
