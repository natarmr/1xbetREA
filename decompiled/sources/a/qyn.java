package a;

/* JADX INFO: loaded from: classes.dex */
public final class qyn extends zje {
    public ibe0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ryn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyn(ryn rynVar, zje zjeVar) {
        super(zjeVar);
        this.k = rynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
