package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b66 implements g66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pws0 f2037a;
    public final pws0 b;
    public final lpm c;
    public final p0n d;
    public final String e;

    public b66(pws0 pws0Var, pws0 pws0Var2, lpm lpmVar, p0n p0nVar, String str) {
        str.getClass();
        this.f2037a = pws0Var;
        this.b = pws0Var2;
        this.c = lpmVar;
        this.d = p0nVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b66)) {
            return false;
        }
        b66 b66Var = (b66) obj;
        return this.f2037a.equals(b66Var.f2037a) && this.b.equals(b66Var.b) && this.c.equals(b66Var.c) && Intrinsics.d(this.d, b66Var.d) && Intrinsics.d(this.e, b66Var.e);
    }

    public final int hashCode() {
        int iE = f140.e(this.c, (this.b.hashCode() + (this.f2037a.hashCode() * 31)) * 31, 31);
        p0n p0nVar = this.d;
        return this.e.hashCode() + ((iE + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(firstOpponentModel=");
        sb.append(this.f2037a);
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
