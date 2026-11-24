package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/lh60;", "La/um40;", "La/mh60;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class lh60 extends um40 {
    public final Function1 b;

    public lh60(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lh60) {
            return this.b == ((lh60) obj).b;
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        mh60 mh60Var = new mh60();
        mh60Var.o = this.b;
        mh60Var.p = -9223372034707292160L;
        return mh60Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        mh60 mh60Var = (mh60) lm40Var;
        mh60Var.o = this.b;
        mh60Var.p = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
