package a;

/* JADX INFO: loaded from: classes.dex */
public final class lz80 extends zje {
    public Object i;
    public bnn0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mz80 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz80(mz80 mz80Var, zje zjeVar) {
        super(zjeVar);
        this.l = mz80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
