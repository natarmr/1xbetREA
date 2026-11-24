package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/eom;", "La/um40;", "La/tom;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eom extends um40 {
    public final boolean b;
    public final Function0 c;
    public final boolean d;
    public final wom e;

    public eom(boolean z, Function0 function0, boolean z2, wom womVar) {
        function0.getClass();
        this.b = z;
        this.c = function0;
        this.d = z2;
        this.e = womVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eom) {
            eom eomVar = (eom) obj;
            if (this.b == eomVar.b && this.d == eomVar.d && this.c == eomVar.c && this.e == eomVar.e && ycl.b(80.0f, 80.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.um40
    public final lm40 f() {
        return new tom(this.b, this.c, this.d, this.e);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        tom tomVar = (tom) lm40Var;
        tomVar.getClass();
        Function0 function0 = this.c;
        function0.getClass();
        tomVar.r = function0;
        tomVar.s = this.d;
        tomVar.t = this.e;
        tomVar.u = 80.0f;
        boolean z = tomVar.q;
        boolean z2 = this.b;
        if (z != z2) {
            tomVar.q = z2;
            qjj.W(tomVar.N0(), null, null, new ya(tomVar, null, (byte) 28), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(80.0f) + ((this.e.hashCode() + ((this.c.hashCode() + brm0.e(Boolean.hashCode(this.b) * 31, 31, this.d)) * 31)) * 31);
    }
}
