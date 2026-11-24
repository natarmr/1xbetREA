package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i7d implements mm40 {
    public final mm40 b;
    public final mm40 c;

    public i7d(mm40 mm40Var, mm40 mm40Var2) {
        this.b = mm40Var;
        this.c = mm40Var2;
    }

    @Override // a.mm40
    public final Object a(Object obj, Function2 function2) {
        return this.c.a(this.b.a(obj, function2), function2);
    }

    @Override // a.mm40
    public final boolean b(Function1 function1) {
        return this.b.b(function1) && this.c.b(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i7d)) {
            return false;
        }
        i7d i7dVar = (i7d) obj;
        return this.b.equals(i7dVar.b) && Intrinsics.d(this.c, i7dVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) a(new StringBuilder("["), new sfc((byte) 14));
        sb.append("]");
        return sb.toString();
    }
}
