package a;

/* JADX INFO: loaded from: classes3.dex */
public final class api0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bpi0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public api0(bpi0 bpi0Var, zje zjeVar) {
        super(zjeVar);
        this.k = bpi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
