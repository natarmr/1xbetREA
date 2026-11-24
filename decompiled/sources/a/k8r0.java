package a;

/* JADX INFO: loaded from: classes4.dex */
public final class k8r0 extends zje {
    public long i;
    public y9s j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w5z l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8r0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.l = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(0L, 0, false, null, null, 0L, this);
    }
}
