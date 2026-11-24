package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kme extends lm40 implements qai0 {
    public boolean o;
    public final boolean p;
    public Function1 q;

    public kme(boolean z, boolean z2, Function1 function1) {
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // a.qai0
    public final boolean J0() {
        return this.o;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        this.q.invoke(abi0Var);
    }

    @Override // a.qai0
    public final boolean y() {
        return this.p;
    }
}
