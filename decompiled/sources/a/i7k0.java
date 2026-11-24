package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/i7k0;", "La/um40;", "La/l7k0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i7k0 extends um40 {
    public final nul0 b;
    public final zx7 c;

    public i7k0(nul0 nul0Var, zx7 zx7Var) {
        this.b = nul0Var;
        this.c = zx7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i7k0)) {
            return false;
        }
        i7k0 i7k0Var = (i7k0) obj;
        return i7k0Var.b.equals(this.b) && i7k0Var.c.equals(this.c);
    }

    @Override // a.um40
    public final lm40 f() {
        return new l7k0(this.b, this.c);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        l7k0 l7k0Var = (l7k0) lm40Var;
        l7k0Var.p = this.b;
        l7k0Var.q = this.c;
    }

    public final int hashCode() {
        return (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
    }
}
