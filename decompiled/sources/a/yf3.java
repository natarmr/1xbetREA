package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yf3 extends zje {
    public z8w0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zf3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf3(zf3 zf3Var, zje zjeVar) {
        super(zjeVar);
        this.k = zf3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
