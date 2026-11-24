package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ngt0 extends zje {
    public String i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ fuj0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngt0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.q = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.v(null, this);
    }
}
