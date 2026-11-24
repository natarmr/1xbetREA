package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class kgd extends diu0 {
    public final Object b;
    public final Function1 c;

    public kgd(Function1 function1, Object obj) {
        obj.getClass();
        this.b = obj;
        this.c = function1;
    }

    @Override // a.diu0
    public final void v() {
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(this.b);
        }
    }
}
