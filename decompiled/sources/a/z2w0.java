package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/z2w0;", "La/um40;", "La/c3w0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class z2w0 extends um40 {
    public final float b;

    public z2w0(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2w0) && Float.compare(this.b, ((z2w0) obj).b) == 0;
    }

    @Override // a.um40
    public final lm40 f() {
        c3w0 c3w0Var = new c3w0();
        c3w0Var.o = this.b;
        return c3w0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ((c3w0) lm40Var).o = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return rw2.j(this.b, "ZIndexElement(zIndex=", Separators.RPAREN);
    }
}
