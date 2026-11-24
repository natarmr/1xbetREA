package a;

/* JADX INFO: loaded from: classes4.dex */
public final class k470 extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l470 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k470(l470 l470Var, zje zjeVar) {
        super(zjeVar);
        this.m = l470Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(0L, this, null, false);
    }
}
