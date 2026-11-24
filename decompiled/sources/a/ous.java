package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ous extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rus k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ous(rus rusVar, zje zjeVar) {
        super(zjeVar);
        this.k = rusVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(this);
    }
}
