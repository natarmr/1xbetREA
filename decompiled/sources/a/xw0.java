package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xw0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zw0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(zw0 zw0Var, zje zjeVar) {
        super(zjeVar);
        this.j = zw0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(this, null, null, false);
    }
}
