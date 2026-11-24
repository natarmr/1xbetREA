package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class sox extends eby {
    public final Function1 e;

    public sox(Function1 function1) {
        this.e = function1;
    }

    @Override // a.eby
    public final boolean l() {
        return false;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        this.e.invoke(th);
    }
}
