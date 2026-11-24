package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qn30 extends zje {
    public int i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tn30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn30(tn30 tn30Var, zje zjeVar) {
        super(zjeVar);
        this.l = tn30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this);
    }
}
