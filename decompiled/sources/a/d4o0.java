package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d4o0 implements f4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pws0 f5465a;
    public final pws0 b;
    public final lpm c;
    public final p0n d;
    public final String e;

    public d4o0(pws0 pws0Var, pws0 pws0Var2, lpm lpmVar, p0n p0nVar, String str) {
        str.getClass();
        this.f5465a = pws0Var;
        this.b = pws0Var2;
        this.c = lpmVar;
        this.d = p0nVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4o0)) {
            return false;
        }
        d4o0 d4o0Var = (d4o0) obj;
        return this.f5465a.equals(d4o0Var.f5465a) && this.b.equals(d4o0Var.b) && this.c.equals(d4o0Var.c) && Intrinsics.d(this.d, d4o0Var.d) && Intrinsics.d(this.e, d4o0Var.e);
    }

    public final int hashCode() {
        int iE = f140.e(this.c, (this.b.hashCode() + (this.f5465a.hashCode() * 31)) * 31, 31);
        p0n p0nVar = this.d;
        return this.e.hashCode() + ((iE + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Roulette(firstOpponentModel=");
        sb.append(this.f5465a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
