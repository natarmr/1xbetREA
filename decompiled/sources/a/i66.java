package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i66 implements o66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f14226a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public i66(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f14226a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i66)) {
            return false;
        }
        i66 i66Var = (i66) obj;
        return this.f14226a.equals(i66Var.f14226a) && this.b.equals(i66Var.b) && this.c.equals(i66Var.c) && Intrinsics.d(this.d, i66Var.d) && Intrinsics.d(this.e, i66Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f14226a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f14226a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
