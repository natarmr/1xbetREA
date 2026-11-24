package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/n0q;", "La/um40;", "La/o0q;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n0q extends um40 {
    public final dnk b;
    public final float c;

    public n0q(dnk dnkVar, float f) {
        this.b = dnkVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0q)) {
            return false;
        }
        n0q n0qVar = (n0q) obj;
        return this.b == n0qVar.b && this.c == n0qVar.c;
    }

    @Override // a.um40
    public final lm40 f() {
        o0q o0qVar = new o0q();
        o0qVar.o = this.b;
        o0qVar.p = this.c;
        return o0qVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        o0q o0qVar = (o0q) lm40Var;
        o0qVar.o = this.b;
        o0qVar.p = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
