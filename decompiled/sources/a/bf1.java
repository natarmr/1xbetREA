package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bf1 extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qgd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf1(qgd qgdVar, zje zjeVar) {
        super(zjeVar);
        this.k = qgdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.X(0L, 0, null, this);
    }
}
