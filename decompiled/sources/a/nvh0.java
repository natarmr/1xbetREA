package a;

/* JADX INFO: loaded from: classes.dex */
public final class nvh0 extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pvh0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvh0(pvh0 pvh0Var, zje zjeVar) {
        super(zjeVar);
        this.k = pvh0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w1(this);
    }
}
