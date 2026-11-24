package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ent extends zje {
    public g41 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pmi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ent(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.k = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.B(false, this);
    }
}
