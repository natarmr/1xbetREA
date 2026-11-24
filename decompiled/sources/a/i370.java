package a;

/* JADX INFO: loaded from: classes3.dex */
public final class i370 extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k370 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i370(k370 k370Var, zje zjeVar) {
        super(zjeVar);
        this.k = k370Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.L(this);
    }
}
