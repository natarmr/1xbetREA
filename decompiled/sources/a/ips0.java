package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ips0;", "La/um40;", "La/jps0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ips0 extends um40 {
    public final tbz b;

    public ips0(tbz tbzVar) {
        this.b = tbzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ips0) && Intrinsics.d(this.b, ((ips0) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        jps0 jps0Var = new jps0();
        jps0Var.o = this.b;
        return jps0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((jps0) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + Separators.RPAREN;
    }
}
