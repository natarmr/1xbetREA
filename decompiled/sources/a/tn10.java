package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tn10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bo10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn10(bo10 bo10Var, zje zjeVar) {
        super(zjeVar);
        this.j = bo10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.B(false, this);
    }
}
