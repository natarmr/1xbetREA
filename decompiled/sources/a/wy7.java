package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wy7 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yy7 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy7(yy7 yy7Var, zje zjeVar) {
        super(zjeVar);
        this.j = yy7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(this);
    }
}
