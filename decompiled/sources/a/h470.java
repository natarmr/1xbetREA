package a;

/* JADX INFO: loaded from: classes4.dex */
public final class h470 extends zje {
    public long i;
    public pbv j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l470 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h470(l470 l470Var, zje zjeVar) {
        super(zjeVar);
        this.m = l470Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(0L, null, null, this);
    }
}
