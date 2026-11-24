package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lab0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ sbb0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lab0(sbb0 sbb0Var, zje zjeVar) {
        super(zjeVar);
        this.j = sbb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
