package a;

/* JADX INFO: loaded from: classes.dex */
public final class u520 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h620 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u520(h620 h620Var, zje zjeVar) {
        super(zjeVar);
        this.j = h620Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
