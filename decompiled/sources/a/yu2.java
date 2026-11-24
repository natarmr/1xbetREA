package a;

/* JADX INFO: loaded from: classes.dex */
public final class yu2 extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ av2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(av2 av2Var, yje yjeVar) {
        super(yjeVar);
        this.k = av2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
