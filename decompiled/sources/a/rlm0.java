package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rlm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3i f30705a;
    public final r3i b;
    public final q3i c;
    public final String d;
    public final String e;
    public final String f;
    public final mgm g;
    public final mgm h;

    public rlm0(r3i r3iVar, r3i r3iVar2, q3i q3iVar, String str, String str2, String str3, mgm mgmVar, mgm mgmVar2) {
        str.getClass();
        this.f30705a = r3iVar;
        this.b = r3iVar2;
        this.c = q3iVar;
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
        if (!(obj instanceof rlm0)) {
            return false;
        }
        rlm0 rlm0Var = (rlm0) obj;
        return this.f30705a.equals(rlm0Var.f30705a) && this.b.equals(rlm0Var.b) && this.c.equals(rlm0Var.c) && Intrinsics.d(this.d, rlm0Var.d) && this.e.equals(rlm0Var.e) && this.f.equals(rlm0Var.f) && this.g.equals(rlm0Var.g) && this.h.equals(rlm0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ua80.b(ua80.b(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f30705a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f30705a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", info=");
        sb.append(this.d);
        sb.append(", seedingLeft=");
        f140.v(sb, this.e, ", seedingRight=", this.f, ", startResultIndicator=");
        sb.append(this.g);
        sb.append(", endResultIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
