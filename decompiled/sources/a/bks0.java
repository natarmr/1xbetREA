package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bks0 extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public Throwable o;
    public /* synthetic */ Object p;
    public final /* synthetic */ fuj0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bks0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.q = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.u(0L, this);
    }
}
