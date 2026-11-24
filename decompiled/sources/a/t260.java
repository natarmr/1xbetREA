package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t260 extends zje {
    public v360 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v360 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t260(v360 v360Var, zje zjeVar) {
        super(zjeVar);
        this.k = v360Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.W(false, this);
    }
}
