package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mo3 extends zje {
    public ujn i;
    public /* synthetic */ Object j;
    public final /* synthetic */ to3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo3(to3 to3Var, zje zjeVar) {
        super(zjeVar);
        this.k = to3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
