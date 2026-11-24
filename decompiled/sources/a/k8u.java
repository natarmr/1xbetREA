package a;

/* JADX INFO: loaded from: classes3.dex */
public final class k8u extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lhf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8u(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(this);
    }
}
