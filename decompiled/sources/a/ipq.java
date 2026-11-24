package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ipq extends lm40 implements lpq {
    public Function1 o;
    public iqq p;

    @Override // a.lpq
    public final void L(iqq iqqVar) {
        if (Intrinsics.d(this.p, iqqVar)) {
            return;
        }
        this.p = iqqVar;
        this.o.invoke(iqqVar);
    }
}
