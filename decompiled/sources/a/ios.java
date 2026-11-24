package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ios extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nmo j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ios(nmo nmoVar, zje zjeVar) {
        super(zjeVar);
        this.j = nmoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, this, null, null);
    }
}
