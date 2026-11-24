package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ga60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ia60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga60(ia60 ia60Var, yje yjeVar) {
        super(yjeVar);
        this.k = ia60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
