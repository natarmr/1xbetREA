package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/zoa0;", "La/um40;", "La/apa0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class zoa0 extends um40 {
    public final d13 b;

    public zoa0(d13 d13Var) {
        this.b = d13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoa0) && this.b.equals(((zoa0) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new apa0(this.b, null);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        apa0 apa0Var = (apa0) lm40Var;
        d13 d13Var = apa0Var.p;
        d13 d13Var2 = this.b;
        if (Intrinsics.d(d13Var, d13Var2)) {
            return;
        }
        apa0Var.p = d13Var2;
        if (apa0Var.q) {
            apa0Var.b1();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
