package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q6d extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r6d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6d(r6d r6dVar, yje yjeVar) {
        super(yjeVar);
        this.j = r6dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
