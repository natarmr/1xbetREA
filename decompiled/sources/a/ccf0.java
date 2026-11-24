package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ccf0 extends zje {
    public Integer i;
    public Long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ocf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccf0(ocf0 ocf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = ocf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.V(this);
    }
}
