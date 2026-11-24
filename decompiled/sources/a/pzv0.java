package a;

/* JADX INFO: loaded from: classes7.dex */
public final class pzv0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ofv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzv0(ofv0 ofv0Var, yje yjeVar) {
        super(yjeVar);
        this.k = ofv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
