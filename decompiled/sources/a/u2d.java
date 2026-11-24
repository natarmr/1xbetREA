package a;

/* JADX INFO: loaded from: classes6.dex */
public final class u2d extends zje {
    public jie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w2d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2d(w2d w2dVar, zje zjeVar) {
        super(zjeVar);
        this.k = w2dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, 0.0f, null, this);
    }
}
