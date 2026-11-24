package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wq0 extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jr0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(jr0 jr0Var, zje zjeVar) {
        super(zjeVar);
        this.m = jr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(0L, false, 0, null, null, false, this);
    }
}
