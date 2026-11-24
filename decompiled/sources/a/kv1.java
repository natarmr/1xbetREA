package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kv1 extends zje {
    public gu1 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uv1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(uv1 uv1Var, zje zjeVar) {
        super(zjeVar);
        this.k = uv1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
