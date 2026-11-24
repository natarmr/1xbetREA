package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pt5 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cu5 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.j = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(this);
    }
}
