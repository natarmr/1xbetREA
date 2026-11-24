package a;

/* JADX INFO: loaded from: classes5.dex */
public final class q980 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ r980 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q980(r980 r980Var, yje yjeVar) {
        super(yjeVar);
        this.k = r980Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
