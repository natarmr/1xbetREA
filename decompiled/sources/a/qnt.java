package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qnt extends zje {
    public cu i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wti k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnt(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.k = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(this);
    }
}
