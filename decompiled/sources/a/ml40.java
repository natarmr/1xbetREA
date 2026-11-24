package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ml40 extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nl40 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml40(nl40 nl40Var, zje zjeVar) {
        super(zjeVar);
        this.k = nl40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
