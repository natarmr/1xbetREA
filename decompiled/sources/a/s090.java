package a;

/* JADX INFO: loaded from: classes5.dex */
public final class s090 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ t090 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s090(t090 t090Var, zje zjeVar) {
        super(zjeVar);
        this.j = t090Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
