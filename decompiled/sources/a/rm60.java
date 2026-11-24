package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rm60 extends zje {
    public aw60 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f47 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm60(f47 f47Var, zje zjeVar) {
        super(zjeVar);
        this.k = f47Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, this);
    }
}
