package a;

/* JADX INFO: loaded from: classes5.dex */
public final class w1d0 extends zje {
    public long i;
    public i050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y1d0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1d0(y1d0 y1d0Var, zje zjeVar) {
        super(zjeVar);
        this.l = y1d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this);
    }
}
