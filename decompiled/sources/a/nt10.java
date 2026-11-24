package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nt10 extends zje {
    public gmq i;
    public pxs0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ot10 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt10(ot10 ot10Var, zje zjeVar) {
        super(zjeVar);
        this.l = ot10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(this);
    }
}
