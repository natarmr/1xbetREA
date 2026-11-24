package a;

/* JADX INFO: loaded from: classes4.dex */
public final class uk40 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ak9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk40(ak9 ak9Var, yje yjeVar) {
        super(yjeVar);
        this.k = ak9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
