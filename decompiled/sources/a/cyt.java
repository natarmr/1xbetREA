package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cyt extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kpt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyt(kpt kptVar, zje zjeVar) {
        super(zjeVar);
        this.k = kptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0, 0, this);
    }
}
