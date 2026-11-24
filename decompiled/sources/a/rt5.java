package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rt5 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cu5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.k = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(0, this, null, false, false);
    }
}
