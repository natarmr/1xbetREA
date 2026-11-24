package a;

/* JADX INFO: loaded from: classes4.dex */
public final class w7u extends zje {
    public long i;
    public long j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ khf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7u(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.m = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.C(0L, 0L, this, false);
    }
}
