package a;

/* JADX INFO: loaded from: classes6.dex */
public final class wyn0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zyn0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.j = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.Y(null, false, this);
    }
}
