package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ms70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nv20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms70(nv20 nv20Var, zje zjeVar) {
        super(zjeVar);
        this.j = nv20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(null, 0, null, null, null, this);
    }
}
