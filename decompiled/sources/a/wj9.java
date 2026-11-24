package a;

import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
public final class wj9 extends zje {
    public IndexedValue i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xj9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj9(xj9 xj9Var, yje yjeVar) {
        super(yjeVar);
        this.k = xj9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
