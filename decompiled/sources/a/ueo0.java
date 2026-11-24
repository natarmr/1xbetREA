package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ueo0 implements xeo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35539a;
    public final a4x b;
    public final int c;
    public final p9r0 d;
    public final a4x e;

    public ueo0(int i, a4x a4xVar, int i2, p9r0 p9r0Var, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f35539a = i;
        this.b = a4xVar;
        this.c = i2;
        this.d = p9r0Var;
        this.e = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueo0)) {
            return false;
        }
        ueo0 ueo0Var = (ueo0) obj;
        return this.f35539a == ueo0Var.f35539a && Intrinsics.d(this.b, ueo0Var.b) && this.c == ueo0Var.c && Intrinsics.d(this.d, ueo0Var.d) && Intrinsics.d(this.e, ueo0Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, cs0.b(this.b, Integer.hashCode(this.f35539a) * 31, 31), 31);
        p9r0 p9r0Var = this.d;
        return this.e.hashCode() + ((iA + (p9r0Var == null ? 0 : p9r0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(tabType=");
        sb.append(this.f35539a);
        sb.append(", players=");
        sb.append(this.b);
        sb.append(", activeMatchListIndex=");
        sb.append(this.c);
        sb.append(", cardsControl=");
        sb.append(this.d);
        sb.append(", columns=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
