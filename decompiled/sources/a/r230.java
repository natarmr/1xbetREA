package a;

/* JADX INFO: loaded from: classes4.dex */
public final class r230 extends zje {
    public k230 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u230 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r230(u230 u230Var, zje zjeVar) {
        super(zjeVar);
        this.k = u230Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(null, this);
    }
}
