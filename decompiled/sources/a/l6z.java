package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/l6z;", "La/um40;", "La/u6z;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l6z extends um40 {
    public final xdr b;

    public l6z(xdr xdrVar) {
        this.b = xdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l6z) {
            return this.b == ((l6z) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        u6z u6zVar = new u6z();
        u6zVar.o = this.b;
        return u6zVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((u6z) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
