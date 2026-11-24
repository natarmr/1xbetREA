package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qd30 implements rd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd30 f28516a;
    public final boolean b;
    public final int c;
    public final a4x d;
    public final a4x e;
    public final long f;

    public qd30(bd30 bd30Var, boolean z, int i, a4x a4xVar, a4x a4xVar2, long j) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f28516a = bd30Var;
        this.b = z;
        this.c = i;
        this.d = a4xVar;
        this.e = a4xVar2;
        this.f = j;
    }

    @Override // a.rd30
    public final boolean a() {
        return this.b;
    }

    @Override // a.rd30
    public final bd30 b() {
        return this.f28516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd30)) {
            return false;
        }
        qd30 qd30Var = (qd30) obj;
        return this.f28516a.equals(qd30Var.f28516a) && this.b == qd30Var.b && this.c == qd30Var.c && Intrinsics.d(this.d, qd30Var.d) && Intrinsics.d(this.e, qd30Var.e) && this.f == qd30Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + cs0.b(this.e, cs0.b(this.d, twn.a(this.c, brm0.e(this.f28516a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.f28516a + ", rtlSupport=" + this.b + ", pageCount=" + this.c + ", chipsList=" + this.d + ", pointsList=" + this.e + ", checkedChipsPosition=" + this.f + Separators.RPAREN;
    }
}
