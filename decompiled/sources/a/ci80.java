package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ci80 extends zje {
    public m06 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ di80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci80(di80 di80Var, zje zjeVar) {
        super(zjeVar);
        this.k = di80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
