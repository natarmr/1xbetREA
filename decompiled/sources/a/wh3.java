package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wh3 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ zh3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh3(zh3 zh3Var, yje yjeVar) {
        super(yjeVar);
        this.k = zh3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
