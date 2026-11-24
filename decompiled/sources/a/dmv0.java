package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dmv0 extends zje {
    public xqj0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ emv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmv0(emv0 emv0Var, zje zjeVar) {
        super(zjeVar);
        this.k = emv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
