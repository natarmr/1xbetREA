package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e4v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ywu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4v(ywu ywuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ywuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v(0L, null, null, this);
    }
}
