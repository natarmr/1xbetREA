package a;

/* JADX INFO: loaded from: classes6.dex */
public final class l030 extends zje {
    public h130 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o030 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l030(o030 o030Var, yje yjeVar) {
        super(yjeVar);
        this.k = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
