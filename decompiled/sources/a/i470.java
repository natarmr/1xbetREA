package a;

/* JADX INFO: loaded from: classes4.dex */
public final class i470 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l470 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i470(l470 l470Var, zje zjeVar) {
        super(zjeVar);
        this.k = l470Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(null, this);
    }
}
