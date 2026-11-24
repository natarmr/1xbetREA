package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vw10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cx10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw10(cx10 cx10Var, zje zjeVar) {
        super(zjeVar);
        this.j = cx10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
