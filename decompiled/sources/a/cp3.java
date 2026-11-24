package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"La/cp3;", "La/um40;", "La/kme;", "La/oai0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cp3 extends um40 implements oai0 {
    public final boolean b;
    public final Function1 c;

    public cp3(Function1 function1, boolean z) {
        this.b = z;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return false;
        }
        cp3 cp3Var = (cp3) obj;
        return this.b == cp3Var.b && this.c == cp3Var.c;
    }

    @Override // a.um40
    public final lm40 f() {
        return new kme(this.b, false, this.c);
    }

    @Override // a.oai0
    public final nai0 g() {
        nai0 nai0Var = new nai0();
        nai0Var.c = this.b;
        this.c.invoke(nai0Var);
        return nai0Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        kme kmeVar = (kme) lm40Var;
        kmeVar.o = this.b;
        kmeVar.q = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }
}
