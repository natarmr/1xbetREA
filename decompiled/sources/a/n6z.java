package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/n6z;", "La/um40;", "La/o6z;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class n6z extends um40 {
    public final Object b;

    public n6z(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6z) && Intrinsics.d(this.b, ((n6z) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        o6z o6zVar = new o6z();
        o6zVar.o = this.b;
        return o6zVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((o6z) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return f140.k(this.b, "LayoutIdElement(layoutId=", Separators.RPAREN);
    }
}
