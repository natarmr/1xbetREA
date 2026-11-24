package a;

/* JADX INFO: loaded from: classes5.dex */
public final class myf0 extends zje {
    public qkt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nyf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myf0(nyf0 nyf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = nyf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(null, this);
    }
}
