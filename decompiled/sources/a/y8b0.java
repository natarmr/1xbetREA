package a;

/* JADX INFO: loaded from: classes4.dex */
public final class y8b0 extends zje {
    public i050 i;
    public g9b0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g9b0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8b0(g9b0 g9b0Var, zje zjeVar) {
        super(zjeVar);
        this.l = g9b0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(this);
    }
}
