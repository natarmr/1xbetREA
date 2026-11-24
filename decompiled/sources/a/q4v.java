package a;

/* JADX INFO: loaded from: classes3.dex */
public final class q4v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r4v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4v(r4v r4vVar, zje zjeVar) {
        super(zjeVar);
        this.j = r4vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
