package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jpa0 implements km40 {
    public Function1 b;
    public caz c;
    public boolean d;
    public final n660 e;

    public jpa0() {
        n660 n660Var = new n660();
        n660Var.d = this;
        n660Var.b = ipa0.f15153a;
        this.e = n660Var;
    }

    public final Function1 f() {
        Function1 function1 = this.b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.h("onTouchEvent");
        throw null;
    }
}
