package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d6u extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a7q k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6u(a7q a7qVar, zje zjeVar) {
        super(zjeVar);
        this.k = a7qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(0, this, null, false);
    }
}
