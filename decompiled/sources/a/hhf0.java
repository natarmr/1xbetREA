package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hhf0 extends zje {
    public long i;
    public q4f j;
    public qu6 k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qv2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf0(qv2 qv2Var, zje zjeVar) {
        super(zjeVar);
        this.o = qv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.s(0L, this);
    }
}
