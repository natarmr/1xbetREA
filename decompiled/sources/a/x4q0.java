package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/x4q0;", "La/um40;", "La/z4q0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x4q0 extends um40 {
    public final e7q0 b;

    public x4q0(e7q0 e7q0Var) {
        this.b = e7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x4q0) {
            return this.b == ((x4q0) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new z4q0(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((z4q0) lm40Var).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
