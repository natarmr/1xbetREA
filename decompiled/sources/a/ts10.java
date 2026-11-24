package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ts10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ clu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts10(clu cluVar, yje yjeVar) {
        super(yjeVar);
        this.j = cluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(false, this);
    }
}
