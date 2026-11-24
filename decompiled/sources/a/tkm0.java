package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tkm0 implements vkm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1n f34102a;
    public final k1n b;
    public final a2m c;
    public final String d;
    public final String e;
    public final String f;

    public tkm0(k1n k1nVar, k1n k1nVar2, a2m a2mVar, String str, String str2, String str3) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f34102a = k1nVar;
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
        if (!(obj instanceof tkm0)) {
            return false;
        }
        tkm0 tkm0Var = (tkm0) obj;
        if (!this.f34102a.equals(tkm0Var.f34102a) || !this.b.equals(tkm0Var.b) || !this.c.equals(tkm0Var.c) || !Intrinsics.d(this.d, tkm0Var.d) || !this.e.equals(tkm0Var.e) || !this.f.equals(tkm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return true;
    }

    public final int hashCode() {
        return x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f34102a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f34102a);
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
