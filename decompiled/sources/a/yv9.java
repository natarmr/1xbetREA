package a;

/* JADX INFO: loaded from: classes.dex */
public final class yv9 extends zje {
    public odd i;
    public /* synthetic */ Object j;
    public final /* synthetic */ aw9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv9(aw9 aw9Var, zje zjeVar) {
        super(zjeVar);
        this.k = aw9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this);
    }
}
