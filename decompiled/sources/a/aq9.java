package a;

/* JADX INFO: loaded from: classes2.dex */
public final class aq9 extends zje {
    public hzb0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bq9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq9(bq9 bq9Var, zje zjeVar) {
        super(zjeVar);
        this.k = bq9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(null, this);
    }
}
