package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zdn extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ k0f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdn(k0f k0fVar, yje yjeVar) {
        super(yjeVar);
        this.k = k0fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
