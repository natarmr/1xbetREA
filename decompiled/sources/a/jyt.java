package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jyt extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lyt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyt(lyt lytVar, zje zjeVar) {
        super(zjeVar);
        this.k = lytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
