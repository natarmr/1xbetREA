package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lgu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lhf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgu(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}
