package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cq00 extends zje {
    public Object i;
    public bm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dq00 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq00(dq00 dq00Var, zje zjeVar) {
        super(zjeVar);
        this.l = dq00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
