package a;

/* JADX INFO: loaded from: classes4.dex */
public final class eu2 extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gu2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu2(gu2 gu2Var, zje zjeVar) {
        super(zjeVar);
        this.l = gu2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(0L, 0L, this);
    }
}
