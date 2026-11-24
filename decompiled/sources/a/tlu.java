package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tlu extends zje {
    public m0u i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlu(cu cuVar, zje zjeVar) {
        super(zjeVar);
        this.k = cuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(this);
    }
}
