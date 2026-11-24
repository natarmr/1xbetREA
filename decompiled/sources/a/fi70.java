package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fi70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ji70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi70(ji70 ji70Var, zje zjeVar) {
        super(zjeVar);
        this.j = ji70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
