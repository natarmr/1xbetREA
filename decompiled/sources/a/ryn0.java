package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ryn0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ cdm0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryn0(cdm0 cdm0Var, yje yjeVar) {
        super(yjeVar);
        this.k = cdm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
