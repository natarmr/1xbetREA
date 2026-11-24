package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j8c extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m8c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8c(m8c m8cVar, zje zjeVar) {
        super(zjeVar);
        this.k = m8cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(0.0d, this);
    }
}
