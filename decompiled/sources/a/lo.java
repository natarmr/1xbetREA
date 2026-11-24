package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lo extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ no k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(no noVar, zje zjeVar) {
        super(zjeVar);
        this.k = noVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
