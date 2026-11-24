package a;

/* JADX INFO: loaded from: classes3.dex */
public final class oyt extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pyt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyt(pyt pytVar, zje zjeVar) {
        super(zjeVar);
        this.k = pytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
