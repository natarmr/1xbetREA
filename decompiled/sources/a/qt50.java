package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qt50 extends zje {
    public mvc i;
    public ut50 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ut50 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt50(ut50 ut50Var, zje zjeVar) {
        super(zjeVar);
        this.l = ut50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(this);
    }
}
