package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mpu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qf9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpu(qf9 qf9Var, zje zjeVar) {
        super(zjeVar);
        this.j = qf9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0, 0L, this, false);
    }
}
