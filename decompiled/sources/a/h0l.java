package a;

/* JADX INFO: loaded from: classes4.dex */
public final class h0l extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ l0l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0l(l0l l0lVar, yje yjeVar) {
        super(yjeVar);
        this.j = l0lVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(null, this);
    }
}
