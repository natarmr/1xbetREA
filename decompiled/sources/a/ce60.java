package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ce60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ imb j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce60(imb imbVar, zje zjeVar) {
        super(zjeVar);
        this.j = imbVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.a(null, this);
        return wne.f39444a;
    }
}
