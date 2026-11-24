package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ktr0 extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ltr0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktr0(ltr0 ltr0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ltr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.P(null, this);
    }
}
