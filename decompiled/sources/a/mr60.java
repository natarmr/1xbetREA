package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mr60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ jr60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr60(jr60 jr60Var, yje yjeVar) {
        super(yjeVar);
        this.k = jr60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
