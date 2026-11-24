package a;

/* JADX INFO: loaded from: classes.dex */
public final class hn20 extends zje {
    public q4f i;
    public /* synthetic */ Object j;
    public final /* synthetic */ on20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.k = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Q0(null, this);
    }
}
