package a;

/* JADX INFO: loaded from: classes.dex */
public final class sjq extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vjq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjq(vjq vjqVar, zje zjeVar) {
        super(zjeVar);
        this.k = vjqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
