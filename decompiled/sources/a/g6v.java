package a;

/* JADX INFO: loaded from: classes6.dex */
public final class g6v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h6v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6v(h6v h6vVar, zje zjeVar) {
        super(zjeVar);
        this.j = h6vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
