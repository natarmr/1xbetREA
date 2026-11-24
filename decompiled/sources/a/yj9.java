package a;

import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
public final class yj9 extends zje {
    public IndexedValue i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k19 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj9(k19 k19Var, yje yjeVar) {
        super(yjeVar);
        this.k = k19Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
