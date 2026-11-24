package a;

/* JADX INFO: loaded from: classes5.dex */
public final class l5f0 extends zje {
    public Integer i;
    public Long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x5f0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5f0(x5f0 x5f0Var, zje zjeVar) {
        super(zjeVar);
        this.l = x5f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.U(this);
    }
}
