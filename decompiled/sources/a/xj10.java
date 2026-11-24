package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xj10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yj10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj10(yj10 yj10Var, zje zjeVar) {
        super(zjeVar);
        this.j = yj10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, 0.0d, null, null, this);
    }
}
