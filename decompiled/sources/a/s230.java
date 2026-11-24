package a;

/* JADX INFO: loaded from: classes4.dex */
public final class s230 extends zje {
    public long i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ u230 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s230(u230 u230Var, zje zjeVar) {
        super(zjeVar);
        this.m = u230Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(null, this);
    }
}
