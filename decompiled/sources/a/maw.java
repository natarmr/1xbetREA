package a;

/* JADX INFO: loaded from: classes3.dex */
public final class maw extends zje {
    public naw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ naw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maw(naw nawVar, zje zjeVar) {
        super(zjeVar);
        this.k = nawVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
