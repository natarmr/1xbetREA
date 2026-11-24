package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/qaz;", "La/um40;", "La/taz;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qaz extends um40 {
    public final uaz b;
    public final hru c;
    public final boolean d;
    public final ma80 e;

    public qaz(uaz uazVar, hru hruVar, boolean z, ma80 ma80Var) {
        this.b = uazVar;
        this.c = hruVar;
        this.d = z;
        this.e = ma80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaz)) {
            return false;
        }
        qaz qazVar = (qaz) obj;
        return Intrinsics.d(this.b, qazVar.b) && Intrinsics.d(this.c, qazVar.c) && this.d == qazVar.d && this.e == qazVar.e;
    }

    @Override // a.um40
    public final lm40 f() {
        taz tazVar = new taz();
        tazVar.o = this.b;
        tazVar.p = this.c;
        tazVar.q = this.d;
        tazVar.r = this.e;
        return tazVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        taz tazVar = (taz) lm40Var;
        tazVar.o = this.b;
        tazVar.p = this.c;
        tazVar.q = this.d;
        tazVar.r = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }
}
