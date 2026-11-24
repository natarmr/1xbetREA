package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f21253a;
    public final tws0 b;
    public final z1m c;
    public final p0n d;
    public final String e;

    public m66(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f21253a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = p0nVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m66)) {
            return false;
        }
        m66 m66Var = (m66) obj;
        return this.f21253a.equals(m66Var.f21253a) && this.b.equals(m66Var.b) && this.c.equals(m66Var.c) && Intrinsics.d(this.d, m66Var.d) && Intrinsics.d(this.e, m66Var.e);
    }

    public final int hashCode() {
        int iB = rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f21253a.hashCode() * 31)) * 31, 31);
        p0n p0nVar = this.d;
        return this.e.hashCode() + ((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f21253a);
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
