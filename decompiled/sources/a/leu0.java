package a;

/* JADX INFO: loaded from: classes4.dex */
public final class leu0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ d8n0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leu0(d8n0 d8n0Var, yje yjeVar) {
        super(yjeVar);
        this.k = d8n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
