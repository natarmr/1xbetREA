package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t610 extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u610 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t610(u610 u610Var, zje zjeVar) {
        super(zjeVar);
        this.k = u610Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
