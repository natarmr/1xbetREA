package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pvu extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qvu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvu(qvu qvuVar, zje zjeVar) {
        super(zjeVar);
        this.k = qvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
