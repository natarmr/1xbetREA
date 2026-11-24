package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tdi0 extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z220 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdi0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.l = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.B(0L, 0L, this);
    }
}
