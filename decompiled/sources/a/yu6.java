package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yu6 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ c00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu6(c00 c00Var, yje yjeVar) {
        super(yjeVar);
        this.k = c00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
