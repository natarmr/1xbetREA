package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v240 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j340 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v240(j340 j340Var, zje zjeVar) {
        super(zjeVar);
        this.k = j340Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(this);
    }
}
