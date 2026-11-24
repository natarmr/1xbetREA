package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class emm0 implements gmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1n f8054a;
    public final k1n b;
    public final a2m c;
    public final String d;
    public final String e;
    public final String f;
    public final vgm g;
    public final vgm h;

    public emm0(k1n k1nVar, k1n k1nVar2, a2m a2mVar, String str, String str2, String str3, vgm vgmVar, vgm vgmVar2) {
        x0m x0mVar = x0m.f40076a;
        str.getClass();
        this.f8054a = k1nVar;
        this.b = k1nVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = vgmVar;
        this.h = vgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emm0)) {
            return false;
        }
        emm0 emm0Var = (emm0) obj;
        if (!this.f8054a.equals(emm0Var.f8054a) || !this.b.equals(emm0Var.b) || !this.c.equals(emm0Var.c) || !Intrinsics.d(this.d, emm0Var.d) || !this.e.equals(emm0Var.e) || !this.f.equals(emm0Var.f)) {
            return false;
        }
        x0m x0mVar = x0m.f40076a;
        return this.g.equals(emm0Var.g) && this.h.equals(emm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((x0m.f40076a.hashCode() + ua80.b(ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f8054a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        x0m x0mVar = x0m.f40076a;
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponent=");
        sb.append(this.f8054a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", customScore=");
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
