package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i4o0 implements n4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tws0 f14156a;
    public final tws0 b;
    public final z1m c;
    public final String d;
    public final p0n e;

    public i4o0(z1m z1mVar, p0n p0nVar, tws0 tws0Var, tws0 tws0Var2, String str) {
        str.getClass();
        this.f14156a = tws0Var;
        this.b = tws0Var2;
        this.c = z1mVar;
        this.d = str;
        this.e = p0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4o0)) {
            return false;
        }
        i4o0 i4o0Var = (i4o0) obj;
        return this.f14156a.equals(i4o0Var.f14156a) && this.b.equals(i4o0Var.b) && this.c.equals(i4o0Var.c) && Intrinsics.d(this.d, i4o0Var.d) && Intrinsics.d(this.e, i4o0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f14156a.hashCode() * 31)) * 31, 31), 31, this.d);
        p0n p0nVar = this.e;
        return iB + (p0nVar == null ? 0 : p0nVar.hashCode());
    }

    public final String toString() {
        return "Dice(firstOpponentModel=" + this.f14156a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", timer=" + this.e + Separators.RPAREN;
    }
}
