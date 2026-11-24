package a;

/* JADX INFO: loaded from: classes3.dex */
public final class uq0 extends zje {
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jr0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(jr0 jr0Var, zje zjeVar) {
        super(zjeVar);
        this.l = jr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(0L, false, 0, 0, null, null, null, false, false, false, this);
    }
}
