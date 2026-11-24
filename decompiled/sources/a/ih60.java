package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ih60;", "La/um40;", "La/jh60;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ih60 extends um40 {
    public final Function1 b;

    public ih60(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih60) && this.b == ((ih60) obj).b;
    }

    @Override // a.um40
    public final lm40 f() {
        jh60 jh60Var = new jh60();
        jh60Var.o = this.b;
        return jh60Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jh60 jh60Var = (jh60) lm40Var;
        jh60Var.getClass();
        jh60Var.o = this.b;
        scq0 scq0Var = jh60Var.p;
        if (scq0Var != null) {
            scq0Var.b();
        }
        jh60Var.p = x4d0.f0(jh60Var, jh60Var.o);
    }

    public final int hashCode() {
        return this.b.hashCode() + rw2.b(Long.hashCode(0L) * 31, 31, 0L);
    }
}
