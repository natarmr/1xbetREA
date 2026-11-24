package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wnt extends zje {
    public ynt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xnt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnt(xnt xntVar, zje zjeVar) {
        super(zjeVar);
        this.k = xntVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
