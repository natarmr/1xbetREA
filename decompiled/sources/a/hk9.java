package a;

/* JADX INFO: loaded from: classes.dex */
public final class hk9 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ik9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk9(ik9 ik9Var, zje zjeVar) {
        super(zjeVar);
        this.j = ik9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
