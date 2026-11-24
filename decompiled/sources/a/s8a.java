package a;

/* JADX INFO: loaded from: classes.dex */
public final class s8a extends zje {
    public g9a i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g9a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.k = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
