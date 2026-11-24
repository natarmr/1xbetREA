package a;

/* JADX INFO: loaded from: classes3.dex */
public final class l8f extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o8f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8f(o8f o8fVar, zje zjeVar) {
        super(zjeVar);
        this.k = o8fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
