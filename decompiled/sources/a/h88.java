package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/h88;", "La/um40;", "La/i88;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h88 extends um40 {
    public final Function1 b;

    public h88(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h88) {
            return this.b == ((h88) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new i88(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        s460 s460Var;
        i88 i88Var = (i88) lm40Var;
        Function1 function1 = this.b;
        i88Var.o = function1;
        if (i88Var.f20279a.n && (s460Var = vcc.X(i88Var, 2).v) != null) {
            s460Var.G1(function1, true);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
