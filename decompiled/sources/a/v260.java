package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v260 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ch2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v260(ch2 ch2Var, yje yjeVar) {
        super(yjeVar);
        this.k = ch2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
