package a;

/* JADX INFO: loaded from: classes3.dex */
public final class onu extends zje {
    public ant i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pnu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onu(pnu pnuVar, zje zjeVar) {
        super(zjeVar);
        this.k = pnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
