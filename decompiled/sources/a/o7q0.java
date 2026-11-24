package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/o7q0;", "La/um40;", "La/p7q0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o7q0 extends um40 {
    public final y9q0 b;

    public o7q0(y9q0 y9q0Var) {
        this.b = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7q0)) {
            return false;
        }
        return Intrinsics.d(this.b, ((o7q0) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new p7q0(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        p7q0 p7q0Var = (p7q0) lm40Var;
        p7q0Var.getClass();
        y9q0 y9q0VarA = afn0.A(this.b, vcc.Z(p7q0Var).A);
        p7q0Var.Z0(y9q0VarA, (mrq) mbc.R(p7q0Var, bmd.k));
        q58 q58Var = p7q0Var.q;
        if (q58Var == null) {
            throw w6x.i("Min size state is not set.");
        }
        q58.a(q58Var, null, null, y9q0VarA, 23);
        n7x.I(p7q0Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
