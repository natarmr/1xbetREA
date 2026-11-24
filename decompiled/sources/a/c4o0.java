package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4o0 implements f4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pws0 f3735a;
    public final pws0 b;
    public final lpm c;
    public final p0n d;
    public final String e;

    public c4o0(pws0 pws0Var, pws0 pws0Var2, lpm lpmVar, p0n p0nVar, String str) {
        str.getClass();
        this.f3735a = pws0Var;
        this.b = pws0Var2;
        this.c = lpmVar;
        this.d = p0nVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4o0)) {
            return false;
        }
        c4o0 c4o0Var = (c4o0) obj;
        return this.f3735a.equals(c4o0Var.f3735a) && this.b.equals(c4o0Var.b) && this.c.equals(c4o0Var.c) && Intrinsics.d(this.d, c4o0Var.d) && Intrinsics.d(this.e, c4o0Var.e);
    }

    public final int hashCode() {
        int iE = f140.e(this.c, (this.b.hashCode() + (this.f3735a.hashCode() * 31)) * 31, 31);
        p0n p0nVar = this.d;
        return this.e.hashCode() + ((iE + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fighting(firstOpponentModel=");
        sb.append(this.f3735a);
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
