package a;

/* JADX INFO: loaded from: classes.dex */
public final class omq extends zje {
    public mie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pmq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omq(pmq pmqVar, yje yjeVar) {
        super(yjeVar);
        this.k = pmqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
