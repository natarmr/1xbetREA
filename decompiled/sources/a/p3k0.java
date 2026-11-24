package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p3k0 extends zje {
    public bby i;
    public i050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cyu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3k0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.l = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.S(null, this);
    }
}
