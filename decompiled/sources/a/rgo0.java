package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rgo0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ qgo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgo0(qgo0 qgo0Var, yje yjeVar) {
        super(yjeVar);
        this.k = qgo0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
