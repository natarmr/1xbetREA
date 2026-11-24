package a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/ubk;", "La/um40;", "La/wbk;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ubk extends um40 {
    public final vhv0 b;

    public ubk(vhv0 vhv0Var) {
        this.b = vhv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ubk) {
            return Intrinsics.d(this.b, ((ubk) obj).b);
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        itt0 itt0Var = y860.k;
        wbk wbkVar = new wbk();
        wbkVar.q = this.b;
        wbkVar.r = itt0Var;
        wbkVar.s = i120.m;
        return wbkVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        wbk wbkVar = (wbk) lm40Var;
        itt0 itt0Var = y860.k;
        vhv0 vhv0Var = wbkVar.q;
        vhv0 vhv0Var2 = this.b;
        if (Intrinsics.d(vhv0Var, vhv0Var2) && itt0Var == wbkVar.r) {
            return;
        }
        wbkVar.q = vhv0Var2;
        wbkVar.r = itt0Var;
        wbkVar.s = new ujo(vhv0Var2, wbkVar.o);
        n7x.I(wbkVar);
    }

    public final int hashCode() {
        return y860.k.hashCode() + (this.b.hashCode() * 31);
    }
}
