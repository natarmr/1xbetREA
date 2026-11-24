package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j4o0 implements n4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f15894a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public j4o0(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f15894a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4o0)) {
            return false;
        }
        j4o0 j4o0Var = (j4o0) obj;
        return this.f15894a.equals(j4o0Var.f15894a) && this.b.equals(j4o0Var.b) && this.c.equals(j4o0Var.c) && Intrinsics.d(this.d, j4o0Var.d) && Intrinsics.d(this.e, j4o0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f15894a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "DicePoker(firstOpponentModel=" + this.f15894a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
