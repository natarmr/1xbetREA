package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class doj0 extends zje {
    public Function1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eoj0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doj0(eoj0 eoj0Var, zje zjeVar) {
        super(zjeVar);
        this.k = eoj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
