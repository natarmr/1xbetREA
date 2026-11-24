package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t6d extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ u6d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(u6d u6dVar, yje yjeVar) {
        super(yjeVar);
        this.j = u6dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
