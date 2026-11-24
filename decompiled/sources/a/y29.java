package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/y29;", "La/um40;", "La/a39;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y29 extends um40 {
    public final e33 b;

    public y29(e33 e33Var) {
        this.b = e33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y29) {
            return this.b == ((y29) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new a39(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        a39 a39Var = (a39) lm40Var;
        e33 e33Var = this.b;
        a39Var.o = e33Var;
        if (a39Var.n) {
            e33Var.invoke(a39Var.p);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
