package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lq10 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vq10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq10(vq10 vq10Var, zje zjeVar) {
        super(zjeVar);
        this.k = vq10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(false, this);
    }
}
