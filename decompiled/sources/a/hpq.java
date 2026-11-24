package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/hpq;", "La/um40;", "La/ipq;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hpq extends um40 {
    public final Function1 b;

    public hpq(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hpq) {
            return this.b == ((hpq) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        ipq ipqVar = new ipq();
        ipqVar.o = this.b;
        return ipqVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((ipq) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
