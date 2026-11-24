package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mq3 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qq3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq3(qq3 qq3Var, zje zjeVar) {
        super(zjeVar);
        this.j = qq3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, null, 0L, 0.0d, 0L, this);
    }
}
