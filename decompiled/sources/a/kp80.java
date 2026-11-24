package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/kp80;", "La/um40;", "La/jp80;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kp80 extends um40 {
    public final on b;

    public kp80(on onVar) {
        this.b = onVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kp80) {
            return this.b == ((kp80) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        jp80 jp80Var = new jp80();
        jp80Var.o = this.b;
        return jp80Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jp80 jp80Var = (jp80) lm40Var;
        jp80Var.o = this.b;
        s0x.S(jp80Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
