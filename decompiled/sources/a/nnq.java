package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nnq extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yj2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnq(yj2 yj2Var, yje yjeVar) {
        super(yjeVar);
        this.k = yj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
